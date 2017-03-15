package ss.example.designpattern.Observer;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class NumberGenerator {
    private ArrayList observers = new ArrayList();

    public void addObserver(ObserverInterface observerInterface) {    // ObserverInterface��ǉ�
        observers.add(observerInterface);
    }

    public void deleteObserver(ObserverInterface observerInterface) { // ObserverInterface���폜
        observers.remove(observerInterface);
    }

    public void notifyObservers() {
        Iterator it = observers.iterator();
        while (it.hasNext()) {
            ObserverInterface o = (ObserverInterface) it.next();
            o.update(this);
        }
    }

    public abstract int getNumber();

    public abstract void execute();
}
