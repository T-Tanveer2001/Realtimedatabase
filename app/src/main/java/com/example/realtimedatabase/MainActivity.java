package com.example.realtimedatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2,btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=(Button)this.findViewById(R.id.button);
        btn2=(Button)this.findViewById(R.id.button2);
        btn3=(Button)this.findViewById(R.id.button3);
    }

    public void domain(View view) {
        Intent intent =new Intent(MainActivity.this,MainActivity2.class);
        startActivity(intent);
    }

    public void update(View view) {

    }

    public void show(View view) {

    }
}