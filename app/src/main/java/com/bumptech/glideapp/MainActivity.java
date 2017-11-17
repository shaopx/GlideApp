package com.bumptech.glideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.load.resource.gif.StreamGifDecoder;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.transition.Transition;
import com.bumptech.glideapp.R;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public static final String TAG ="MainActivity" ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Glide glide = Glide.get(this);
        Registry registry = glide.getRegistry();

        List<ImageHeaderParser> parsers = new ArrayList<>();
//        parsers.add();

//        List<ImageHeaderParser> imageHeaderParsers = registry.getImageHeaderParsers();
//        for (ImageHeaderParser imageHeaderParser : imageHeaderParsers) {
//            Log.d(TAG, "onCreate: "+imageHeaderParser);
//        }
//
//        ByteBufferGifDecoder byteBufferGifDecoder =
//                new ByteBufferGifDecoder(this, imageHeaderParsers, glide.getBitmapPool(), glide.getArrayPool());
//        registry.prepend(Registry.BUCKET_GIF, ByteBuffer.class, GifDrawable.class, byteBufferGifDecoder);
//
//        registry.prepend(Registry.BUCKET_GIF,
//                InputStream.class,
//                GifDrawable.class,  new StreamGifDecoder(imageHeaderParsers, byteBufferGifDecoder, glide.getArrayPool()));

        final ImageView gifIv = findViewById(R.id.gifiv);
//        String imgUrl = "http://pic.wenwen.soso.com/pqpic/wenwenpic/0/20171011210319-79198387_gif_405_293_4728568/0";
//        String imgUrl = "http://pic.wenwen.soso.com/pqpic/wenwenpic/0/20171116143737-1895154083_gif_398_305_3740344/0";
//        String imgUrl = "https://wx2.sinaimg.cn/large/866a67c7gy1fkaw7ewstng20b208hhdx.gif";
        String imgUrl   = "http://pic.wenwen.soso.com/pqpic/wenwenpic/0/20171116143738-1327109971_gif_405_293_3665345/0";
//        Glide.with(this).asGif().apply(new RequestOptions().diskCacheStrategy(DiskCacheStrategy.NONE))
//                .load(imgUrl).into(new SimpleTarget<GifDrawable>() {
//
//
//            @Override
//            public void onResourceReady(GifDrawable resource, Transition<? super GifDrawable> transition) {
//                Log.d(TAG, "onResourceReady: resource:"+resource+", framecount:"+resource.getFrameCount());
//                gifIv.setImageDrawable(resource);
//                resource.start();
//            }
//        });
        Glide.with(this).load(imgUrl).into(gifIv);
    }
}
