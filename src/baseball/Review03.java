package baseball;

public class Review03 {

    public static void main(String[] args) {
        // 各チームのプロフィールを生成
        BaseBallTeam YS = new BaseBallTeam("東京ヤクルトスワローズ", 80, 59, 4);
        BaseBallTeam YD = new BaseBallTeam("横浜DeNAベイスターズ", 73, 68, 2);
        BaseBallTeam HT = new BaseBallTeam("阪神タイガース", 68, 71, 4);
        BaseBallTeam YG = new BaseBallTeam("読売ジャイアンツ", 68, 72, 3);
        BaseBallTeam HC = new BaseBallTeam("広島東洋カープ", 66, 74, 3);
        BaseBallTeam DD = new BaseBallTeam("中日ドラゴンズ", 66, 75, 2);

        YS.report();
        YD.report();
        HT.report();
        YG.report();
        HC.report();
        DD.report();

    }

}
