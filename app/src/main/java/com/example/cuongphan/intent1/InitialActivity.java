package com.example.cuongphan.intent1;

import android.content.Intent;
import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Random;

public class InitialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_initial);
        Button btn_input = (Button)findViewById(R.id.btn_btn_intput);
        Button btn_random = (Button)findViewById(R.id.btn_random);
        btn_input.setOnClickListener(new calSumInput());
        btn_random.setOnClickListener(new calSumRandom());
    }


    private class calSumInput implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            int number_1 = 0, number_2 = 0;
            EditText et_number1 = (EditText)findViewById(R.id.et_number1);
            EditText et_number2 = (EditText)findViewById(R.id.et_number2);
            if(et_number1.getText().toString().isEmpty() && et_number2.getText().toString().isEmpty()){
                number_1 = 10;
                number_2 = 20;
            }
            else{
                number_1 = Integer.valueOf(et_number1.getText().toString());
                number_2 = Integer.valueOf(et_number2.getText().toString());
            }
            Intent calSumIntent = new Intent(InitialActivity.this, SumActivity.class);
            Bundle bundle = new Bundle();
            bundle.putInt("number_1", number_1);
            bundle.putInt("number_2", number_2);
            calSumIntent.putExtras(bundle);
            startActivity(calSumIntent);
        }

    }

    private class calSumRandom implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Intent calSumIntent = new Intent(InitialActivity.this, SumActivity.class);
            Bundle number_to_cal = new Bundle();
            Random rd = new Random();
            int number_1 = rd.nextInt(100);
            int number_2 = rd.nextInt(100);
            number_to_cal.putInt("number_1", number_1);
            number_to_cal.putInt("number_2", number_2);
            calSumIntent.putExtras(number_to_cal);
            startActivity(calSumIntent);
        }
    }
}
