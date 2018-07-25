package com.bumptech.glideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {
    public static final String TAG ="MainActivity" ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showBrokenGif();
    }

    private void showBrokenGif() {
        final ImageView gifIv = findViewById(R.id.gifiv);
//        String imgUrl = "http://pic.wenwen.soso.com/pqpic/wenwenpic/0/20171011210319-79198387_gif_405_293_4728568/0";
        String imgUrl = "http://pic.wenwen.soso.com/pqpic/wenwenpic/0/20171116143737-1895154083_gif_398_305_3740344/0";
//        String imgUrl = "https://wx2.sinaimg.cn/large/866a67c7gy1fkaw7ewstng20b208hhdx.gif";
//        String imgUrl   = "http://pic.wenwen.soso.com/pqpic/wenwenpic/0/20171116143738-1327109971_gif_405_293_3665345/0";
        Glide.with(this).asGif().load(imgUrl).into(gifIv);
    }
}
