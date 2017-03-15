package ss.example.designpattern.singleton;

import android.util.Log;

import ss.example.designpattern.MainActivity;

public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton() {
        Log.e(MainActivity.TAG, "인스턴스를 생성했습니다.");
    }

    public static Singleton getInstance() {
        return singleton;
    }
}
