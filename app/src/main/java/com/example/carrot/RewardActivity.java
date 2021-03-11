package com.example.carrot;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class RewardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.allowance);
    }
    //Add set method for reward amount
    public void setReward(View view){
        thisHandler.setReward(Float.parseFloat(rewardInput.getText().toString()));
    }


    GoalHandler thisHandler = new GoalHandler();
    Button inputButton = findViewById(R.id.bt_reward_enter);
    EditText rewardInput = findViewById(R.id.et_reward_amount);
}
