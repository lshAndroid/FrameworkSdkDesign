package lsh.com.libdesigncode.netframe;

import java.util.Map;

public class HttpHelper implements IHttpProcessor{
    private static IHttpProcessor mIHttpProcessor=null;
    private static HttpHelper _instance;
//    private Map<String,Object> mParams;
    public static void init(IHttpProcessor iHttpProcessor){
        mIHttpProcessor=iHttpProcessor;
    }

    public HttpHelper() {
//        mParams = new HashMap<>();
    }
    public static HttpHelper obtain(){
        synchronized (HttpHelper.class){
            if (_instance==null){
                _instance=new HttpHelper();
            }
        }
        return _instance;
    }

    @Override
    public void post(String url, Map<String, Object> params, ICallback iCallback) {
        String finalUrl=HttpStringUtis.appendParams(url,params);
//        System.out.println("http网址："+finalUrl);
        mIHttpProcessor.post(finalUrl,params,iCallback);
    }

    @Override
    public void get(String url, Map<String, Object> params, ICallback iCallback) {
        String finalUrl=HttpStringUtis.appendParams(url,params);
//        System.out.println("http网址："+finalUrl);
        mIHttpProcessor.get(finalUrl,params,iCallback);
    }

}
