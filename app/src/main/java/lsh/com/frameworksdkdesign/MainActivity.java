package lsh.com.frameworksdkdesign;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Map;

import lsh.com.frameworksdkdesign.databinding.ActivityMainBinding;
import lsh.com.libdesigncode.glideframe.FrameGlide;
import lsh.com.libdesigncode.netframe.HttpCallback;
import lsh.com.libdesigncode.netframe.HttpHelper;

public class MainActivity extends AppCompatActivity {
    public static final String NetPost1="http://www.wanandroid.com/tools/mockapi/8272/ailinmyapp";
    public static final String NetGet="http://wx.handle.ktvdaren.com/interface/webbindroom_new.php?type=1&roomid=57284649";
    public static final String NetPG1="https://www.oschina.net/action/apiv2/banner?catalog=1";
    public static final String PicUrl="https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1490971670&di=d810318cdd61531a5d1d3861d00c2d9e&imgtype=jpg&er=1&src=http%3A%2F%2Fpic1.win4000.com%2Fwallpaper%2Fc%2F570cc782c8312.jpg";
    public static final String PicUr2="https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1490377243693&di=5471e90a84737494794986fe81833f9f&imgtype=0&src=http%3A%2F%2Fnews.cpd.com.cn%2Fn203193%2Fc29879991%2Fpart%2F29880124.jpg";
    private ActivityMainBinding mBinding;
    private Context mContextApp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        mBinding=DataBindingUtil.setContentView(this,R.layout.activity_main);
        mContextApp=this;
        mBinding.mTvNetGet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplication(),"点击get",Toast.LENGTH_SHORT).show();
                String beseUrl="https://www.oschina.net/action/apiv2/banner?";
                Map<String,Object> mMap=new HashMap<>();
                mMap.put("catalog","1");
                HttpHelper.obtain().get(beseUrl, mMap, new HttpCallback<NetJsonEntity>() {
                    @Override
                    public void onFailure(String msg) {
                        Toast.makeText(mContextApp,"联网失败:"+msg,Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onSuccess(NetJsonEntity resultEntity) {
                        Toast.makeText(mContextApp,"联网get异步:"+resultEntity.getMessage(),Toast.LENGTH_SHORT).show();
//                        System.out.println("联网:"+resultEntity.getMsg());

                    }
                });
            }
        });
        mBinding.mTvNetPost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplication(),"点击post",Toast.LENGTH_SHORT).show();
                String beseUrl="https://www.oschina.net/action/apiv2/banner?";
                Map<String,Object> mMap=new HashMap<>();
                mMap.put("catalog","1");
                HttpHelper.obtain().post(beseUrl, mMap, new HttpCallback<NetJsonEntity>() {
                    @Override
                    public void onFailure(String msg) {
                        Toast.makeText(mContextApp,"联网失败:"+msg,Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onSuccess(NetJsonEntity resultEntity) {
                        Toast.makeText(mContextApp,"联网post异步:"+resultEntity.getMessage(),Toast.LENGTH_SHORT).show();

//                        System.out.println("联网post异步:"+resultEntity.getStatus());

                    }
                });
            }
        });
        initImageShow();
        mBinding.mTvGlide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FrameGlide.getInstance().loadPhoto(MainActivity.this,PicUr2,mBinding.mImageShow1);
            }
        });
    }

    private void initImageShow() {
        FrameGlide.getInstance().loadPhoto(this,PicUrl,mBinding.mImageShow1);
        FrameGlide.getInstance().loadPhoto(this,PicUrl,mBinding.mImageShow2);

    }
}
