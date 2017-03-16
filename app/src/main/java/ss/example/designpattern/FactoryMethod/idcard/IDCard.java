package ss.example.designpattern.FactoryMethod.idcard;

import android.util.Log;

import ss.example.designpattern.FactoryMethod.framework.Product;
import ss.example.designpattern.MainActivity;

public class IDCard extends Product {
    private String owner;

    public IDCard(String owner) {
        Log.e(MainActivity.TAG, owner + "의 카드를 만듭니다.");
        this.owner = owner;
    }

    @Override
    public void use() {
        Log.e(MainActivity.TAG, owner + "의 카드를 사용합니다.");
    }

    public String getOwner() {
        return owner;
    }
}
