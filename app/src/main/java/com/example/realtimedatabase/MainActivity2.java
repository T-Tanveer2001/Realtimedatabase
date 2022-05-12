package com.example.realtimedatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class MainActivity2 extends AppCompatActivity {

    EditText  t1,t2,t3,t4;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t1=(EditText) this.findViewById(R.id.editTextTextPersonName);
        t2=(EditText) this.findViewById(R.id.editTextTextPersonName2);
        t3=(EditText) this.findViewById(R.id.editTextTextPersonName3);
        t4=(EditText) this.findViewById(R.id.editTextTextPersonName4);
        btn=(Button) this.findViewById(R.id.button4);
    }

    public void submit(View view) {
        HashMap<String, Object> m = new HashMap<String , Object>();
        m. put ("Name" , t1.getText ().toString());
        m.put ("City" ,t2.getText ().toString());
        m.put ("Contact" ,t3.getText ().toString());
        m.put ("blood group",t4.getText ().toString());
        FirebaseDatabase.getInstance().getReference().child("User").setValue(m);


    }
}