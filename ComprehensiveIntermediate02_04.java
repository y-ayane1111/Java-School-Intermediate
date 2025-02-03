import java.util.Random;
import java.util.Scanner;

public class ComprehensiveIntermediate02_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        while (true) {
            System.out.println("ジャンケン");
            System.out.println("0: グー 1: チョキ 2: パー ＞数字を入力してください");
            // ジャンケンの選択肢を表示

            int user;// ユーザー

            // 入力が正しい数字か確認する
            while (true) {
                if (scanner.hasNextInt()) {
                    user = scanner.nextInt();
                    if (user >= 0 && user <= 2) {
                        break; // 正しい入力があればループを抜ける
                    } else {
                        System.out.println("Error");
                        System.out.println("ジャンケン");
                        System.out.println("0: グー 1: チョキ 2: パー ＞数字を入力してください");
                    }
                } else {
                    System.out.println("Error");
                    System.out.println("ジャンケン");
                    System.out.println("0: グー 1: チョキ 2: パー ＞数字を入力してください");

                }
            }

            // コンピュータの選択 ランダム
            int computer = rand.nextInt(3); // 0, 1, 2 のいずれか

            // ユーザーとコンピュータの選択肢を表示
            System.out.println("あなたの選択: " + getString(user));
            System.out.println("コンピュータの選択: " + getString(computer));

            // 勝敗判定
            String result = Winner(user, computer);
            System.out.println(result);
            break;

        }

    }

    // 択肢を文字に変換する
    public static String getString(int choice) {
        switch (choice) {
            case 0:
                return "グー";
            case 1:
                return "チョキ";
            case 2:
                return "パー";
            default:
                return "";
        }
    }

    // 勝敗を判定する
    public static String Winner(int user, int computer) {
        if (user == computer) {
            return "引き分けです！";
        } else if ((user == 0 && computer == 1) ||
                (user == 1 && computer == 2) ||
                (user == 2 && computer == 0)) {
            return "あなたの勝ちです！";
        } else {
            return "コンピュータの勝ちです！";
        }
    }
}