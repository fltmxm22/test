package ss.example.designpattern.TemplateMethod;

/**
 * Created by SS on 2017-03-15.
 */

public abstract class AbstractDisplay {

    public abstract void open();

    public abstract void print();

    public abstract void close();

    public final void display() {
        open();
        for (int i = 0; i < 5; i++)
            print();
        close();
    }
}
