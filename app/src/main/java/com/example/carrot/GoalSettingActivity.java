package com.example.carrot;

import android.os.Bundle;
import com.example.carrot.GoalHandler;
import androidx.appcompat.app.AppCompatActivity;

public class GoalSettingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.set_goals);
    }

    //add goal-setting algorithm
    //add setGoal method
    public void addNewGoal(){
        thisHandler.addGoal("");
    }

    //add setSubGoal method
    GoalHandler thisHandler = new GoalHandler();
}
