package baseball;

public class Review03 {

    public static void main(String[] args) {
        BaseBallTeam[] teams = new BaseBallTeam[6];
        teams[0] = new BaseBallTeam("東京ヤクルトスワローズ", 80, 59, 4);
        teams[1] = new BaseBallTeam("横浜DeNAベイスターズ", 73, 68, 2);
        teams[2] = new BaseBallTeam("阪神タイガース", 68, 71, 4);
        teams[3] = new BaseBallTeam("読売ジャイアンツ", 68, 72, 3);
        teams[4] = new BaseBallTeam("広島東洋カープ", 66, 74, 3);
        teams[5] = new BaseBallTeam("中日ドラゴンズ", 66, 75, 2);

        for(BaseBallTeam team : teams) {
            team.report();
        }
    }

}
