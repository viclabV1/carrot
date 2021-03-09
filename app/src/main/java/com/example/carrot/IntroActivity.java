package com.example.carrot;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.example.carrot.ManagerActivity;

import androidx.appcompat.app.AppCompatActivity;

public class IntroActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.introduction);

    }
    //called on button press after first time opening app
    public void firstOpen(View view){
        Intent intent = new Intent(this, RewardActivity.class);
        startActivity(intent);

    }
}
