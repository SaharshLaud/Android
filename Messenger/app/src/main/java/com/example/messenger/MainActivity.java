package com.example.messenger;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {
    Button send_button;
    EditText send_text, send_text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        send_button = (Button)findViewById(R.id.send_button_id);
        send_text = (EditText)findViewById(R.id.send_text_id);
        send_text2 = (EditText)findViewById(R.id.send_text_id2);


        send_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String str = send_text.getText().toString();
                String str2 = send_text2.getText().toString();

                Intent intent = new Intent(getApplicationContext(), Second_Activity.class);
                intent.putExtra("message_key", str);
                intent.putExtra("message_key2", str2);


                startActivity(intent);
            }
        });
    }
}