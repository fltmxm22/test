package ss.example.designpattern.TemplateMethod;

import android.util.Log;

import ss.example.designpattern.MainActivity;

/**
 * Created by SS on 2017-03-15.
 */

public class CharDisplay extends AbstractDisplay {

    private String ch;

    public CharDisplay(String ch) {
        this.ch = ch;
    }

    @Override
    public void open() {
        Log.e(MainActivity.TAG, "+---------------+");
    }

    @Override
    public void print() {
        Log.e(MainActivity.TAG, "| " + ch + " |");
    }

    @Override
    public void close() {
        Log.e(MainActivity.TAG, "+---------------+");
    }
}
