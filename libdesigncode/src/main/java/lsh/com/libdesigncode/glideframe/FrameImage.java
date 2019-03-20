package lsh.com.libdesigncode.glideframe;

import android.content.Context;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;

public class FrameImage {
    public static RequestManager with(Context context){
        return Glide.with(context);
    }
}
