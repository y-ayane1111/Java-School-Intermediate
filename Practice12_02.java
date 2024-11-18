import java.util.Scanner;

public class Practice12_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("入力してください > ");
        String dayPeriod = sc.nextLine();
        // 時間帯を入力

        // greetメソッドを呼び出す処理を書く⑤
        greet(dayPeriod);
    }

    // 以下の部分を、mainメソッドの外に出す。④
    private static void greet(String dayPeriod) {
        if (dayPeriod.equals("朝")) {
            System.out.println("Good morning!!");
        } else if (dayPeriod.equals("昼")) {
            System.out.println("Good aftenoom!!");
        } else if (dayPeriod.equals("夜")) {
            System.out.println("Good evening!!");
        } else {
            System.out.println("出力なし");
        }
    }
}
