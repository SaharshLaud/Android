package com.example.mymenuapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.my_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if (id == R.id.act_1){
            Intent int1 = new Intent(MainActivity.this, Act1.class);
            startActivity(int1);
            return false;
        }
        if (id == R.id.act_2){
            Intent int2 = new Intent(MainActivity.this, Act2.class);
            startActivity(int2);
            return false;
        }
        return super.onOptionsItemSelected(item);
    }
}