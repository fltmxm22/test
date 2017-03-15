package ss.example.designpattern.Strategy;

public interface Strategy {
    public abstract Hand nextHand();
    public abstract void study(boolean win);
}
