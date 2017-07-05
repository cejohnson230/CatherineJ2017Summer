package com.example.catherinejohnson.catherinej2017summer.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

import com.example.catherinejohnson.catherinej2017summer.util.UtilLog;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by catherinejohnson on 7/5/17.
 */

public class TestService extends Service{

    private Timer timer = new Timer();
    public int update = 0;
    public static final String ACTION = "action";
    public static final String UPDATE = "update";
    @Override
    public int onStartCommand(Intent intent, int flags, int StartId) {
        String value = intent.getStringExtra("Service");

        timer.schedule(new UpdateTask(), 0, 1000);
        return super.onStartCommand(intent, flags, StartId);


    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    private class UpdateTask extends TimerTask {
        public void run() {
            Intent intent = new Intent();
            intent.setAction(ACTION);
            intent.putExtra(UPDATE, ++update);
            sendBroadcast(intent);
            UtilLog.d("Service", update+"");

        }
    }
}
