package ss.example.designpattern;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import ss.example.designpattern.Command.command.TurnOnCommand;
import ss.example.designpattern.Command.invoker.RemoteControl;
import ss.example.designpattern.Command.receiver.Television;
import ss.example.designpattern.FactoryMethod.framework.Factory;
import ss.example.designpattern.FactoryMethod.framework.Product;
import ss.example.designpattern.FactoryMethod.idcard.IDCardFactory;
import ss.example.designpattern.Singleton.Singleton;
import ss.example.designpattern.Singleton.SingletonQuiz;
import ss.example.designpattern.Strategy.GameCharacter;
import ss.example.designpattern.Strategy.Knife;
import ss.example.designpattern.Strategy.Sword;
import ss.example.designpattern.TemplateMethod.AbstractDisplay;
import ss.example.designpattern.TemplateMethod.CharDisplay;

public class MainActivity extends AppCompatActivity {
    public static String TAG = "bnp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        singleton();
//        singletonQuizThread();
//        templateMethod();
//        factoryMethod();
//        strategy();

        RemoteControl remote = new RemoteControl();
        Television television = new Television();
        TurnOnCommand tvOn = new TurnOnCommand(television);

        remote.setCommand(tvOn);
        remote.onClick();
    }

    private void singleton() {
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
                    singletonQuiz();
                }
            }).start();
        }
    }

    private void singletonQuiz() {
        SingletonQuiz obj1 = SingletonQuiz.getInstance();
        SingletonQuiz obj2 = SingletonQuiz.getInstance();
        Log.e(TAG, "obj 1 : " + obj1.toString());
        Log.e(TAG, "obj 2 : " + obj2.toString());
    }

    private void templateMethod() {
        AbstractDisplay d1 = new CharDisplay("BnpInnovation");
        d1.display();
    }

    private void factoryMethod() {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("정종호");
        Product card2 = factory.create("이승철");
        Product card3 = factory.create("박종현");
        card1.use();
        card2.use();
        card3.use();
    }

    private void strategy() {
        GameCharacter character = new GameCharacter();
        character.attack();
        character.setWeapon(new Knife());
        character.attack();
        character.setWeapon(new Sword());
        character.attack();
    }


}
