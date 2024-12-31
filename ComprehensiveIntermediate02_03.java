import java.util.Scanner;

public class ComprehensiveIntermediate02_03 {
    public static void main(String[] args) {
        System.out.print("ゾロ目で大当たり！チャンスは30回");
        Scanner sc = new Scanner(System.in);
        System.out.print("begin と入力してください＞ ");

        for (int i = 0; i < 30; i++) {
            for (int rand = 0; rand <= 3; rand++) {
                Random rand = new Random();
                int Number = rand.nextInt(9);

                System.out.print(Numbe);

                switch (Number) {
                    case 000, 111, 222, 333, 444, 555, 666, 777, 888, 999 ->
                        System.out.println((i + 1) + "回目で大当たりです。おめでとうございます。");
                }
            }
        }

    }

}
