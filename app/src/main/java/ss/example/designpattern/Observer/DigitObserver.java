package ss.example.designpattern.Observer;

import android.util.Log;

import ss.example.designpattern.MainActivity;

public class DigitObserver implements ObserverInterface {
    public void update(NumberGenerator generator) {
        Log.e(MainActivity.TAG, "DigitObserver:" + generator.getNumber());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
    }
}
