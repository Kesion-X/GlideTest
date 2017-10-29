package com.kjf.www.glidetest;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView ImageView = (android.widget.ImageView) findViewById(R.id.image);


        //基本用法
        Glide.with(this)
             .load("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1509182912575&di=c903bdec542d96f11cae901830115530&imgtype=0&src=http%3A%2F%2Fe.hiphotos.baidu.com%2Fimage%2Fpic%2Fitem%2F242dd42a2834349b3f5656d0c2ea15ce36d3be16.jpg")   .into(ImageView);

       // GlideApp.with()
        //GlideApp
    }
}
