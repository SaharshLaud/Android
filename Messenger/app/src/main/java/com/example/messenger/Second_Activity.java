package com.example.messenger;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Second_Activity extends AppCompatActivity {

    TextView receiver_msg, receiver_msg2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_);

        receiver_msg = (TextView)findViewById(R.id.received_value_id);
        receiver_msg2 = (TextView)findViewById(R.id.received_value_id2);


        Intent intent = getIntent();

        String str = intent.getStringExtra("message_key");
        String str2 = intent.getStringExtra("message_key2");


        receiver_msg.setText(str);
        receiver_msg2.setText(str2);

    }
}