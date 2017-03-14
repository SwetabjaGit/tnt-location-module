package com.stabstudio.hotspottest;

import android.app.IntentService;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.Context;
import android.location.Location;


public class LocationService extends IntentService {

    public LocationService() {
        super(LocationService.class.getSimpleName());
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        if(intent != null){

        }
    }

}
