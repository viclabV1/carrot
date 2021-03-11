package com.example.carrot;
import android.database.sqlite.*;
//backbone of app
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

    //has app been opened before?
    private boolean opened = false;
    //is this the first time the app has been opened today?
    private boolean newDay = true;
    //is this the first time the app has been opened this week?
    private boolean newWeek = true;
}
