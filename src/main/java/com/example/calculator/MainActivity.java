package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

     TextView re;
     double result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        re=(TextView) findViewById(R.id.re);
        findViewById(R.id.bt0).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                re.setText(re.getText().toString()+"0");
            }
        });
        findViewById(R.id.bt1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                re.setText(re.getText().toString()+"1");
            }
        });
        findViewById(R.id.bt2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                re.setText(re.getText().toString()+"2");
            }
        });
        findViewById(R.id.bt3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                re.setText(re.getText().toString()+"3");
            }
        });
        findViewById(R.id.bt4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                re.setText(re.getText().toString()+"4");
            }
        });
        findViewById(R.id.bt5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                re.setText(re.getText().toString()+"5");
            }
        });
        findViewById(R.id.bt6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                re.setText(re.getText().toString()+"6");
            }
        });
        findViewById(R.id.bt7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                re.setText(re.getText().toString()+"7");
            }
        });
        findViewById(R.id.bt8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                re.setText(re.getText().toString()+"8");
            }
        });
        findViewById(R.id.bt9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                re.setText(re.getText().toString()+"9");
            }
        });
        findViewById(R.id.plus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                re.setText(re.getText().toString()+" + ");
            }
        });
        findViewById(R.id.mins).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                re.setText(re.getText().toString()+" - ");
            }
        });
        findViewById(R.id.div).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                re.setText(re.getText().toString()+" / ");
            }
        });
        findViewById(R.id.mul).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                re.setText(re.getText().toString()+" * ");
            }
        });
        findViewById(R.id.ac).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                re.setText("");
                result=0;
            }
        });
        findViewById(R.id.eq).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=re.getText().toString();
                String []nums =s.split(" ");
                 result=Double.parseDouble(nums[0]);
                int j=0;
                //loop to reach for operators
                for(int i=1;i<nums.length;i+=2){
                    if(nums[i].equals("+"))
                        result+=Double.parseDouble(nums[j+=2]);
                    else if(nums[i].equals("-"))
                        result-=Double.parseDouble(nums[j+=2]);
                    else if(nums[i].equals("*"))
                        result*=Double.parseDouble(nums[j+=2]);
                    else if(nums[i].equals("/"))
                        result/=Double.parseDouble(nums[j+=2]);


                }
                re.setText(" "+result);

            }
        });



    }
}