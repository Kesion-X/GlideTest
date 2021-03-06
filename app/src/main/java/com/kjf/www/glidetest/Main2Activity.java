package com.kjf.www.glidetest;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ImageView ImageView = (android.widget.ImageView) findViewById(R.id.image);
        ImageView ImageView2 = (android.widget.ImageView) findViewById(R.id.image2);
        ImageView ImageView3 = (android.widget.ImageView) findViewById(R.id.image3);
        //基本用法
        Glide.with(this)
             .load("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1509182912575&di=c903bdec542d96f11cae901830115530&imgtype=0&src=http%3A%2F%2Fe.hiphotos.baidu.com%2Fimage%2Fpic%2Fitem%2F242dd42a2834349b3f5656d0c2ea15ce36d3be16.jpg")   .into(ImageView);

       // GlideApp.with()
        //GlideApp


        /*
        占位符
        placeholder
        error
        fallback
        */
        GlideApp.with(this).load("https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=2439096583,1320889890&fm=27&gp=0.jpg").placeholder(R.drawable.timg).error(R.drawable.error).into(ImageView2);


        /**
         * 缓存策略的使用
         * diskcacheStrategy(DiskCacheStratrgy.ALL) 可根据网络请求判断做出是否要从磁盘读取
         * onlyRetrieveFromCache(true)  某些情形下，你可能希望只要图片不在缓存中则加载直接失败。如果要完成这个目标，你可以在单个请求的基础上使用 onlyRetrieveFromCache 方法：
         */
        GlideApp.with(this)
                .load("")
                .placeholder(R.drawable.timg)
                .error(R.drawable.error)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .onlyRetrieveFromCache(true)
                .into(ImageView3);


       // TextView TextView = (TextView)findViewById(R.id.text);
      //  TextView.setText(Glide.get(getApplication;

    }
}
