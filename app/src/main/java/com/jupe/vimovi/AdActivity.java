package com.jupe.vimovi;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

/**
 * Created by Keppe on 25/01/2018.
 */

public class AdActivity extends AppCompatActivity{

    private ImageView adImages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adloop);

        adImages = (ImageView)findViewById(R.id.iv_adloop);
        adImages.setBackgroundResource(R.drawable.ad_sequence);

        AnimationDrawable adLoop = (AnimationDrawable)adImages.getBackground();
        adLoop.start();
    }
}
