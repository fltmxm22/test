package ss.example.designpattern.Command.receiver;

import android.util.Log;

import ss.example.designpattern.MainActivity;

/**
 * Created by SS on 2017-03-16.
 */

public class Television {
    public void on() {
        Log.e(MainActivity.TAG, "Turn on");
    }
}

