package ss.example.designpattern;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import ss.example.designpattern.singleton.Singleton;
import ss.example.designpattern.singleton.SingletonQuiz;

public class MainActivity extends AppCompatActivity {
    public static String TAG = "bnp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        singletonMethod();
//        singletonQuizThread();
    }


    private void singletonMethod() {
        Log.e(TAG, "Start");
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        if (obj1 == obj2)
            Log.e(TAG, "obj1과 obj2는 같은 인스턴스입니다.");
        else
            Log.e(TAG, "obj1과 obj2는 다른 인스턴스입니다.");
    }

    private void singletonQuizThread() {
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    singletonQuizMethod();
                }
            }).start();
        }
    }

    private void singletonQuizMethod() {
        SingletonQuiz obj1 = SingletonQuiz.getInstance();
        SingletonQuiz obj2 = SingletonQuiz.getInstance();
        Log.e(TAG, "obj 1 : " + obj1.toString());
        Log.e(TAG, "obj 2 : " + obj2.toString());
    }
}
