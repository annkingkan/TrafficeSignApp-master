package com.kingkan.cs58.sdu.traffcesignapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AboutMeActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);
    }//onCreate


    public void clickBack(View view) {
        finish();
    }

    public void playSound(View view) {
        if (mediaPlayer!=null){
            mediaPlayer.stop();
            mediaPlayer.release();

        }
        mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.a);
        mediaPlayer.start();

    }

    public void clickFacebook(View view) {
        Intent fbIntent=new Intent(Intent.ACTION_VIEW);
        fbIntent.setData(Uri.parse("https://www.facebook.com/kingkanaa"));
        startActivity(fbIntent);
    }

    public void clickMobila(View view) {
        Intent mbIntent=new Intent(Intent.ACTION_DIAL);
        mbIntent.setData(Uri.parse("tel:0944494269"));
        startActivity(mbIntent);

    }

    public void clickMaps(View view) {
        String lat="13.776077";
        String lng="100.510641";
        String label="มหาวิทยาลัยสวนดุสิต";
        Uri location=Uri.parse("https://maps.google.com/maps?z=10&q=loc:"+lat+","+lng+"("+label+")");
        Intent mapIntent=new Intent(Intent.ACTION_VIEW,location);
        mapIntent.setPackage("com.google.android.apps.maps");//บังคับเปิด google maps ใช้เทสไม่ได้ ต้องรันบนเครื่องจริงเท่านั้น
        startActivity(mapIntent);


    }
}//class
