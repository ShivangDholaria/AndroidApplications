package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,b_plus,b_minus,b_div,b_mul,b_eq;
    TextView t1;
    int l1, l2, ans;
    boolean flag_p = false,flag_mn = false,flag_d = false,flag_ml = false, flag_eq = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.Num1);
        b2 = findViewById(R.id.Num2);
        b3 = findViewById(R.id.Num3);
        b4 = findViewById(R.id.Num4);
        b5 = findViewById(R.id.Num5);
        b6 = findViewById(R.id.Num6);
        b7 = findViewById(R.id.Num7);
        b8 = findViewById(R.id.Num8);
        b9 = findViewById(R.id.Num9);
        b0 = findViewById(R.id.Num0);

        b_plus = findViewById(R.id.Add);
        b_minus = findViewById(R.id.Subract);
        b_div = findViewById(R.id.Divide);
        b_eq = findViewById(R.id.Equal);
        b_mul = findViewById(R.id.Multiply);

        t1 = findViewById(R.id.textView);
        t1.setText("");

    }

    public void select_1(View v){
        t1 = findViewById(R.id.textView);

        if(flag_eq) {
            t1.setText("");
            flag_eq = false;
        }

        String text = t1.getText().toString() + "1";
        t1.setText(text);
    }

    public void select_2(View v){
        t1 = findViewById(R.id.textView);

        if(flag_eq) {
            t1.setText("");
            flag_eq = false;
        }

        String text = t1.getText().toString() + "2";
        t1.setText(text);
    }

    public void select_3(View v){
        t1 = findViewById(R.id.textView);

        if(flag_eq) {
            t1.setText("");
            flag_eq = false;
        }

        String text = t1.getText().toString() + "3";
        t1.setText(text);
    }

    public void select_4(View v){
        t1 = findViewById(R.id.textView);

        if(flag_eq) {
            t1.setText("");
            flag_eq = false;
        }

        String text = t1.getText().toString() + "4";
        t1.setText(text);
    }

    public void select_5(View v){
        t1 = findViewById(R.id.textView);

        if(flag_eq) {
            t1.setText("");
            flag_eq = false;
        }

        String text = t1.getText().toString() + "5";
        t1.setText(text);
    }

    public void select_6(View v){
        t1 = findViewById(R.id.textView);

        if(flag_eq) {
            t1.setText("");
            flag_eq = false;
        }

        String text = t1.getText().toString() + "6";
        t1.setText(text);
    }

    public void select_7(View v){
        t1 = findViewById(R.id.textView);

        if(flag_eq) {
            t1.setText("");
            flag_eq = false;
        }

        String text = t1.getText().toString() + "7";
        t1.setText(text);
    }

    public void select_8(View v){
        t1 = findViewById(R.id.textView);

        if(flag_eq) {
            t1.setText("");
            flag_eq = false;
        }

        String text = t1.getText().toString() + "8";
        t1.setText(text);
    }

    public void select_9(View v){
        t1 = findViewById(R.id.textView);

        if(flag_eq) {
            t1.setText("");
            flag_eq = false;
        }

        String text = t1.getText().toString() + "9";
        t1.setText(text);
    }

    public void select_0(View v){

        t1 = findViewById(R.id.textView);

        if(flag_eq) {
            t1.setText("");
            flag_eq = false;
        }

        String text = t1.getText().toString() + "0";
        t1.setText(text);
    }

    public void select_plus(View v){
        t1 = findViewById(R.id.textView);

        if (flag_mn | flag_d | flag_ml);
        else
        {
            flag_p = true;
            l1 = Integer.parseInt(t1.getText().toString());
            t1.setText("");
        }
   }

    public void select_minus(View v){
        t1 = findViewById(R.id.textView);

        if (flag_p | flag_d | flag_ml);
        else
        {
            flag_mn = true;
            l1 =  Integer.parseInt(t1.getText().toString());
            t1.setText("");
        }
    }

    public void select_div(View v) {
        t1 = findViewById(R.id.textView);

        if (flag_mn | flag_p | flag_ml) ;
        else
        {
            flag_d = true;
            l1 = Integer.parseInt(t1.getText().toString());
            t1.setText("");
        }
    }

    public void select_mul(View v) {
        t1 = findViewById(R.id.textView);

        if (flag_mn | flag_d | flag_p) ;
        else
        {
            flag_ml = true;
            l1 = Integer.parseInt(t1.getText().toString());
            t1.setText("");
        }
    }

    public void select_eq(View v){
        t1 = findViewById(R.id.textView);
        l2 = Integer.parseInt(t1.getText().toString());

        if(flag_ml)
        {
            flag_ml = false;
            t1.setText((l1 * l2) + "");
        }
        if(flag_p) {
            flag_p = false;
            t1.setText((l1 + l2) + "");
        }
        if(flag_mn) {

            t1.setText((l1 - l2) + "");
        }
        if(flag_d) {
            if (l2 != 0)
                t1.setText((l1 / l2) + "");
            else
                Toast.makeText(this, "Can not divide by 0",Toast.LENGTH_SHORT);

            flag_d = false;
        }

        flag_eq = true;
    }

}