import java.util.Scanner;

public class Practice12_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("入力してください > ");
        String greet = sc.nextLine();

        if (greet.equals("朝")) {
            System.out.println("Good morning!!");
        } else if (greet.equals("昼")) {
            System.out.println("Good aftenoom!!");
        } else if (greet.equals("夜")) {
            System.out.println("Good evening!!");
        } else {
            System.out.println("出力なし");
        }
    }
}
