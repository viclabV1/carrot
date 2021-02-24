package com.example.carrot;

public class GeneralManager {


    public boolean getOpened(){
        return opened;
    }
    public void setOpened(){
        opened=!opened;
    }
    public boolean getNewDay(){
        return newDay;
    }
    public boolean getNewWeek(){
        return newWeek;
    }

    private boolean opened = false;
    private boolean newDay = true;
    private boolean newWeek = true;
}
