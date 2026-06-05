package com.hack.androidgo.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class HackBackgroundService extends Service {
    @Override
    public IBinder onBind(Intent intent) { return null; }
    // Background CAN monitoring
}