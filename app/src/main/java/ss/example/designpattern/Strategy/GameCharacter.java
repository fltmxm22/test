package ss.example.designpattern.Strategy;

import android.util.Log;

import ss.example.designpattern.MainActivity;

/**
 * Created by SS on 2017-03-16.
 */

public class GameCharacter {
    //접근점
    private Weapon weapon;

    //교환 가능
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack() {
        if (weapon == null) {
            Log.e(MainActivity.TAG, "맨손 공격");
        } else {
            weapon.attack();
        }
    }
}
