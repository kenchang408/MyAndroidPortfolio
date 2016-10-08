package com.example.piggy.myportfolio;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchProj1(View view) {
        Context context = getApplicationContext();
        CharSequence text = this.getString(R.string.toast_common_txt) + this.getString(R.string.proj1_title) + " " + "app";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context,text,duration);
        toast.show();
    }

    public void launchProj2(View view) {
        Context context = getApplicationContext();
        CharSequence text = this.getString(R.string.toast_common_txt) + this.getString(R.string.proj2_title) + " " + "app";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context,text,duration);
        toast.show();
    }

    public void launchProj3(View view) {
        Context context = getApplicationContext();
        CharSequence text = this.getString(R.string.toast_common_txt) + this.getString(R.string.proj3_title) + " " + "app";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context,text,duration);
        toast.show();
    }

    public void launchProj4(View view) {
        Context context = getApplicationContext();
        CharSequence text = this.getString(R.string.toast_common_txt) + this.getString(R.string.proj4_title) + " " + "app";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context,text,duration);
        toast.show();
    }

    public void launchProj5(View view) {
        Context context = getApplicationContext();
        CharSequence text = this.getString(R.string.toast_common_txt) + this.getString(R.string.proj5_title) + " " + "app";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context,text,duration);
        toast.show();
    }

    public void launchProj6(View view) {
        Context context = getApplicationContext();
        CharSequence text = this.getString(R.string.toast_common_txt) + this.getString(R.string.proj6_title) + " " + "app";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context,text,duration);
        toast.show();
    }

}
