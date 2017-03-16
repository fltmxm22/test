package ss.example.designpattern.Strategy;

import android.util.Log;

import ss.example.designpattern.MainActivity;

/**
 * Created by SS on 2017-03-16.
 */

public class Sword implements Weapon {
    @Override
    public void attack() {
        Log.e(MainActivity.TAG, "검 공격");
    }
}
