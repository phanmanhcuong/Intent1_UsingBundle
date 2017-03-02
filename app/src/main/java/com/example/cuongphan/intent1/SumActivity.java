package com.example.cuongphan.intent1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sum);
        getNumbersFromExtra();
    }

    private void getNumbersFromExtra(){
        Intent sum_activity_intent = getIntent();
        Bundle cal_sum = sum_activity_intent.getExtras();
        int number_1 = cal_sum.getInt("number_1");
        int number_2 = cal_sum.getInt("number_2");
        calSumAndDisplay(number_1, number_2);
    }
    
    private void calSumAndDisplay(int number1, int number2){
        int sum = number1 + number2;
        TextView tv_number1 = (TextView)findViewById(R.id.tv_number1);
        TextView tv_number2 = (TextView)findViewById(R.id.tv_number2);
        TextView tv_sum = (TextView)findViewById(R.id.tv_sum);
        tv_number1.setText("First value " + String.valueOf(number1));
        tv_number2.setText("Second value " + String.valueOf(number2));
        tv_sum.setText("Sum is " + String.valueOf(sum));
    }

    public void back_to_initialactivity(View view){
        Intent initial_activity_intent = new Intent(this, InitialActivity.class);
        startActivity(initial_activity_intent);
    }
}
