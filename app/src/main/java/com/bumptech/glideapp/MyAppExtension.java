package com.bumptech.glideapp;

import android.graphics.Bitmap;

import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.annotation.GlideExtension;
import com.bumptech.glide.annotation.GlideOption;
import com.bumptech.glide.annotation.GlideType;
import com.bumptech.glide.load.resource.bitmap.BitmapTransitionOptions;
import com.bumptech.glide.request.RequestOptions;

/**
 * RequestOptionsExtensions must be public, with private constructors and only static methods
 */
@GlideExtension
public class MyAppExtension {

    private static final int MIN_THUMB_SIZE = 100;

    private static final RequestOptions DECODE_TYPE_BITMAP = RequestOptions.decodeTypeOf(Bitmap.class).lock();

    private MyAppExtension() {
    }

    @GlideOption
    public static void miniThumb(RequestOptions options) {
        options
                .fitCenter()
                .override(MIN_THUMB_SIZE);
    }

    @GlideType(Bitmap.class)
    public static void asMyBitmap(RequestBuilder<Bitmap> requestBuilder) {
        requestBuilder
                .transition(new BitmapTransitionOptions())
                .apply(DECODE_TYPE_BITMAP);
    }

}