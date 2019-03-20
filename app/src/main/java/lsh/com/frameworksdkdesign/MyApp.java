package lsh.com.frameworksdkdesign;

import android.app.Application;

import lsh.com.libdesigncode.netframe.HttpHelper;
import lsh.com.libdesigncode.netframe.OkhttpProcessor;

public class MyApp extends Application {
    public static MyApp instace=null;

    public static MyApp getInstace() {
        return instace;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instace=this;
//        HttpHelper.init(new VolleyProcessor(this));//封装联网,代理模式快速切换 volley
        HttpHelper.init(new OkhttpProcessor());//封装联网,代理模式快速切换 okhttp

    }
}
