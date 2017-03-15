package ss.example.designpattern.singleton;

import android.util.Log;

import ss.example.designpattern.MainActivity;

/**
 * Created by SS on 2017-03-15.
 */

public class SingletonQuiz {
    private static SingletonQuiz singletonQuiz = null;

    private SingletonQuiz() {
        Log.e(MainActivity.TAG, "인스턴스를 생성했습니다.");
    }

    public static SingletonQuiz getInstance() {
        if (singletonQuiz == null) {
            singletonQuiz = new SingletonQuiz();
        }
        return singletonQuiz;
    }
}
