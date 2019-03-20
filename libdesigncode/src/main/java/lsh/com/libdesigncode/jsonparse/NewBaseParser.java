package lsh.com.libdesigncode.jsonparse;

import com.google.gson.Gson;

/**
 * Created by lsh on 2015/12/31.
 * 网络json解析
 */
public class NewBaseParser {
    public static NewBaseParser mInstance=null;
    private NewBaseParser(){}
    /*
    * 获取单实例
    * */
    public static NewBaseParser getParseInstance(){
        if (mInstance == null) {
            synchronized (NewBaseParser.class) {
                if (mInstance == null) {
                    mInstance=new NewBaseParser();
                }
            }
        }
        return mInstance;
    }
    public Object parse(String result, Class<?> cls) {
        return new Gson().fromJson(result, cls);
    }
}
