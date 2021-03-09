package com.example.carrot;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import com.example.carrot.GeneralManager;

public class ManagerActivity extends AppCompatActivity {
    GeneralManager manager = new GeneralManager();
    @Override
    protected void onCreate(Bundle savedInstanceState){


        super.onCreate(savedInstanceState);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        //On open, open intro activity if app has not been opened before
        if(!manager.getOpened()){
            openIntro();
        }

        //opens reward activity if start of new week
        else if(manager.getNewWeek()){
            openAllowance();
        }

        //opens goal setting activity if new day
        else if(manager.getNewDay()){
            openGoalSetting();
        }

        //otherwise opens the goal activity
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


    private void openGoalSetting(){
        Intent intent = new Intent(this, GoalSettingActivity.class);
        startActivity(intent);
    }
    public GeneralManager getManager(){
        return manager;
    }
    private void openGoals(){}
/*
    private boolean firstOpen = true;
    private boolean newWeek = true;
    private boolean newDay = true;
*/
}

