package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.myapplication.util.displayutil;
import com.example.myapplication.util.utils;

public class MainActivity extends AppCompatActivity {
    private TextView text_screen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text_screen = findViewById(R.id.text_screen);

        int dip_10 = utils.dip2px(this, 10L);
        text_screen.setPadding(dip_10, dip_10, dip_10, dip_10);
        text_screen.setBackgroundColor(0xff00ffff);
        text_screen.setTextColor(0xff333333);
        showScreenInfo();
    }
    private void showScreenInfo() {
        int width = displayutil.getScreenWidth(this);
        int height = displayutil.getScreenHeigh(this);
        float sensity = displayutil.getScreenDensity(this);
        String info = String.format("当前屏幕的宽度是%dpx，高度是%dpx，像素密度是%f", width, height, sensity);
        text_screen.setText(info);
    }
}