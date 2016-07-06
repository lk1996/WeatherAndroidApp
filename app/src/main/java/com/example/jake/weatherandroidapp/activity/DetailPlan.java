package com.example.jake.weatherandroidapp.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.jake.weatherandroidapp.R;

public class DetailPlan extends AppCompatActivity {
    public final static String DETAIL_PLAN_ACTION="org.intent.action.DETAIL_PLAN_ACTION";
 Button getBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_plan);
        getBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
