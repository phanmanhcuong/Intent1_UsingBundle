package com.example.cuongphan.intent1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.Random;

public class InitialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_initial);
    }

    public void sendData(View view){
        Random rd = new Random();
        int number_1 = rd.nextInt(100);
        int number_2 = rd.nextInt(100);
        //double number_1 = Math.random();
        //double number_2 = Math.random();
        Intent sum_activity_intent = new Intent(this, SumActivity.class);
        Bundle number_to_cal = new Bundle();
        number_to_cal.putInt("number_1", number_1);
        number_to_cal.putInt("number_2", number_2);
        sum_activity_intent.putExtras(number_to_cal);
        startActivity(sum_activity_intent);
    }
}
