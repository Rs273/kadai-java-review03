package baseball;

public class BaseBallTeam {
    private String name;  // チーム名
    private int win;      // 勝利
    private int lose;     // 敗北
    private int draw;     // 引分

    // 引数なしコンストラクタ
    public BaseBallTeam() {

    }

    // 引数ありコンストラクタ
    public BaseBallTeam(String name, int win, int lose, int draw) {
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getWin() {
        return win;
    }
    public void setWin(int win) {
        this.win = win;
    }
    public int getLose() {
        return lose;
    }
    public void setLose(int lose) {
        this.lose = lose;
    }
    public int getDraw() {
        return draw;
    }
    public void setDraw(int draw) {
        this.draw = draw;
    }

    // 勝率を返す
    public double getRate() {
        return (double) win / (win + lose);
    }

    // 報告する
    public void report() {
        double rate = getRate();
        System.out.println(name + " の2022年の成績は " + win + "勝 " + lose + "敗 " + draw + "分、勝率は " + rate + "です。");
    }
}
