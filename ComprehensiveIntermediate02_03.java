import java.util.Scanner;
import java.util.Random;

public class ComprehensiveIntermediate02_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ゾロ目で大当たり!チャンスは30回");
        System.out.println("begin と入力してください＞ ");
        String word = sc.nextLine();
        if (word.equals("begin")) {// beginを入力させる
            for (int i = 0; i < 30; i++) {// 30回繰り返す
                Random rand = new Random();// 乱数を定義

                int arr1 = rand.nextInt(10);// 1つ目の整数
                int arr2 = rand.nextInt(10);// 2つ目の整数
                int arr3 = rand.nextInt(10);// 3つ目の整数

                System.out.println(i + "回目" + arr1 + arr2 + arr3);// 繰り返しの回数と出た数字を表示

                if (arr1 == arr2 && arr2 == arr3) {// ゾロ目を定義
                    System.out.println(i + "回目で大当たりです。おめでとうございます。");
                    break;// 終了させる
                }
            }

        }
    }
}
