package ss.example.designpattern.Strategy;

public class Player {
    private String name;
    private Strategy strategy;
    private int wincount;
    private int losecount;
    private int gamecount;
    public Player(String name, Strategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }
    public Hand nextHand() {                                // �헪�ɂ����������𗧂Ă�
        return strategy.nextHand();
    }
    public void win() {
        strategy.study(true);
        wincount++;
        gamecount++;
    }
    public void lose() {
        strategy.study(false);
        losecount++;
        gamecount++;
    }
    public void even() {                // ��������
        gamecount++;
    }
    public String toString() {
        return "[" + name + ":" + gamecount + " games, " + wincount + " win, " + losecount + " lose" + "]";
    }
}
