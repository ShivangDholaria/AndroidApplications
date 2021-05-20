package com.example.wallpaperchanger;

import androidx.appcompat.app.AppCompatActivity;

import android.app.WallpaperManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    Timer timer;
    int count = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timer = new Timer();
    }

    public void change_wallpaper(View view)
    {
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                if(count <=4)
                {
                    wallpaper(count);
                    count++;
                }
                else
                    count = 0;
            }
        }, 1000,5000);
    }

    void wallpaper(int i){
        if(i == 1)
        {
            Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.img1);
            WallpaperManager wallpaperManager = WallpaperManager.getInstance(getApplicationContext());

            try{
                wallpaperManager.setBitmap(bitmap);
            }
            catch (IOException E)
            {
                System.out.println(E.toString());
            }

        }
        if(i == 2)
        {
            Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.img2);
            WallpaperManager wallpaperManager = WallpaperManager.getInstance(getApplicationContext());

            try{
                wallpaperManager.setBitmap(bitmap);
            }
            catch (IOException E)
            {
                System.out.println(E.toString());
            }

        }
        if(i == 3)
        {
            Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.img3);
            WallpaperManager wallpaperManager = WallpaperManager.getInstance(getApplicationContext());

            try{
                wallpaperManager.setBitmap(bitmap);
            }
            catch (IOException E)
            {
                System.out.println(E.toString());
            }

        }
        if(i == 4)
        {
            Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.img4);
            WallpaperManager wallpaperManager = WallpaperManager.getInstance(getApplicationContext());

            try{
                wallpaperManager.setBitmap(bitmap);
            }
            catch (IOException E)
            {
                System.out.println(E.toString());
            }

        }
    }

}