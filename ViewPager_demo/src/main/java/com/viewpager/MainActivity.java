package com.viewpager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn_one,btn_two,btn_three,btn_four;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initview();
    }

    private void initview() {
        btn_one = (Button) findViewById(R.id.btn_one);
        btn_two = (Button) findViewById(R.id.btn_two);
        btn_three = (Button) findViewById(R.id.btn_three);
        btn_four = (Button) findViewById(R.id.btn_four);
        btn_one.setOnClickListener(this);
        btn_two.setOnClickListener(this);
        btn_three.setOnClickListener(this);
        btn_four.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.btn_one:
                startActivity(new Intent(this,FirstActivity.class));
                break;
            case R.id.btn_two:
                startActivity(new Intent(this,SecondActivity.class));
                break;
            case R.id.btn_three:
                startActivity(new Intent(this,ThirdActivity.class));
                break;
            case R.id.btn_four:
                startActivity(new Intent(this,ForthActivity.class));
                break;
        }
    }
}
