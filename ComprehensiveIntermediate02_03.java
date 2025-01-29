import java.util.Scanner;
import java.util.Random;

public class ComprehensiveIntermediate02_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ゾロ目で大当たり!チャンスは30回");
        System.out.println("begin と入力してください＞ ");
        String word = sc.nextLine();
        if (word.equals("begin")) {
            // beginを入力させる
            for (int x = 0; x < 30; x++) {
                int[] arr = new int[3];
                Random rand = new Random();
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = rand.nextInt(10);
                    System.out.print(i);

                }
            }

            // 乱数で３つの自然数を表示させる
            // 30回表示させる

        } else {
            System.out.println("もう一度入力してください");
        }

    }
}