package lsh.com.libdesigncode.jsonparse;

/**
 * Created by lsh on 2017/4/18.
 */

public class FrameParser {  //工厂模式方便修改gson解析
    public static Object getManager(String result, Class<?> cls){
        return NewBaseParser.getParseInstance().parse(result,cls);
    }
    // return new NewBaseParser().parse(result,cls);   //由于解析经常的用,static比较高效
}
