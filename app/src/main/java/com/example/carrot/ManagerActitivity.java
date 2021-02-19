package com.example.carrot;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

public class ManagerActitivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){


        super.onCreate(savedInstanceState);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        if(firstOpen){
            openIntro();
        }
        else if(newWeek){
            openAllowance();
        }
        else if(newDay){
            openGoalSetting();
        }
        else openGoals();
    }
    private void openIntro(){
        Intent intent = new Intent(this, IntroActivity.class);
        startActivity(intent);
    }

    private void openAllowance(){
        Intent intent = new Intent(this, RewardActivity.class);
        startActivity(intent);
    }
    private void openGoalSetting(){}
    private void openGoals(){}

    private boolean firstOpen = true;
    private boolean newWeek = true;
    private boolean newDay = true;
}
