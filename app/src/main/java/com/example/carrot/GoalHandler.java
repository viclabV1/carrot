package com.example.carrot;

import java.util.ArrayList;

public class GoalHandler {

    public ArrayList<String> getGoals(){
        return goals;
    }
    public String getGoal(int index){
        return goals.get(index);
    }
    public void setGoals(ArrayList<String> g){
        goals = g;
    }
    public void addGoal(String goal){
        goals.add(goal);
    }
    public float getReward(){
        return reward;
    }
    public void setReward(float r){
        reward = r;
    }
    public void goalCompleted(int i){
        completed.add(goals.remove(i));
    }


private float reward;
private ArrayList<String> goals;
private ArrayList<String> completed;
private float rewardPerGoal = reward/(goals.size());
}
