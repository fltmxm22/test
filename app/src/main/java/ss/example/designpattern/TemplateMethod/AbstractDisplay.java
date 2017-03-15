package ss.example.designpattern.TemplateMethod;

/**
 * Created by SS on 2017-03-15.
 */

public abstract class AbstractDisplay {  //추상 클래스

    // 하위 클래스에 구현을 맡기는 추상 메소드
    public abstract void open();

    public abstract void print();

    public abstract void close();

    // 추상 클래스에서 구현되고 있는 메소드 display
    public final void display() {
        open();
        for (int i = 0; i < 5; i++)
            print();
        close();
    }
}
