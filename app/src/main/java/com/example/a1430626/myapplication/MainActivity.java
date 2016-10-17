package com.example.a1430626.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tespaSucks();
    }

    public void tespaSucks(){
        TextView tv = new TextView(this);
        RelativeLayout rl = (RelativeLayout)findViewById(R.id.poop);
        String paikhana = getResources().getString(R.string.poopstr);

        tv.setText(paikhana);
        tv.setTextSize(25);
        rl.addView(tv);
    }
}
