package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private CareerExpert expert = new CareerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickFindCareer(View view) {
        TextView career_options = (TextView) findViewById(R.id.textView);
        Spinner stream = (Spinner) findViewById(R.id.spinner);
        String careerType = String.valueOf(stream.getSelectedItem());


        List<String> careerList = expert.getStreams(careerType);
        StringBuilder streamFormatted = new StringBuilder();
        for (String career : careerList) {
            streamFormatted.append(career).append('\n');
        }
        career_options.setText(streamFormatted);

    }
}