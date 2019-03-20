package lsh.com.libdesigncode.netframe;

import android.content.Context;
import android.os.Handler;
import android.os.Message;

import java.io.IOException;
import java.util.Map;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class OkhttpProcessor implements IHttpProcessor {
    public static final String TAG="OkhttpProcessor";
    private static OkHttpClient mOkHttpClient=null;
    private Handler mHandler;
    public OkhttpProcessor() {
        mOkHttpClient = new OkHttpClient();
        mHandler=new Handler();
    }
    public static RequestBody appendBody(Map<String,Object> paramsMap){

        FormBody.Builder builder = new FormBody.Builder();
        if (paramsMap==null){
            return builder.build();
        }
        for (String key : paramsMap.keySet()) {
            //追加表单信息
            builder.add(key, paramsMap.get(key).toString());
        }
        return builder.build();
    }


    @Override
    public void post(String url, Map<String, Object> params, final ICallback iCallback) {
        RequestBody requestBody=appendBody(params);
        Request request = new Request.Builder()
                .url(url)//请求接口。如果需要传参拼接到接口后面。
                .post(requestBody)
                .header("User-Agent","a")
                .build();//创建Request 对象
        System.out.println("http post:"+request.toString());
        mOkHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call,IOException e) {
                final String errorMsg=e.toString();
                mHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        iCallback.onFailure(errorMsg);
                    }
                });
            }

            @Override
            public void onResponse(Call call, final Response response) throws IOException {
                if (response.isSuccessful()){
                    final String result=response.body().string();
                    mHandler.post(new Runnable() {
                        @Override
                        public void run() {
                            iCallback.onSuccess(result);
                        }
                    });

                }else {
                    final String result=response.message().toString();
                    mHandler.post(new Runnable() {
                        @Override
                        public void run() {
                            iCallback.onFailure(result);
                        }
                    });

                }

            }
        });
    }
    private Message msg;
    Context mContext;
    @Override
    public void get(String url, Map<String, Object> params, final ICallback iCallback) {
//        RequestBody requestBody=appendBody(params);
        String url1=HttpStringUtis.appendParams(url,params);
        Message msg=Message.obtain();
        Request request = new Request.Builder()
                .url(url1)//请求接口。如果需要传参拼接到接口后面。
                .get()
                .header("User-Agent","a")
                .build();//创建Request 对象
        System.out.println("http get:"+request.toString());
        mOkHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                final String errorMsg=e.toString();
                mHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        iCallback.onFailure(errorMsg);
                    }
                });

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                if (response.isSuccessful()){
                    final String result=response.body().string();
                    mHandler.post(new Runnable() {
                        @Override
                        public void run() {
                            iCallback.onSuccess(result);
                        }
                    });
                }else {
                    final String result=response.message().toString();
                    mHandler.post(new Runnable() {
                        @Override
                        public void run() {
                            iCallback.onFailure(result);
                        }
                    });

                }

            }
        });
    }
}
