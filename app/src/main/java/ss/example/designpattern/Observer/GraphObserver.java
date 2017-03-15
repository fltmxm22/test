package ss.example.designpattern.Observer;

import android.util.Log;

import ss.example.designpattern.MainActivity;

public class GraphObserver implements ObserverInterface {
    public void update(NumberGenerator generator) {
        System.out.print("GraphObserver:");
        int count = generator.getNumber();
        String s = "";
        for (int i = 0; i < count; i++) {
            s = s + "*";
        }
        Log.e(MainActivity.TAG, s);
        Log.e(MainActivity.TAG, "");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
    }
}
