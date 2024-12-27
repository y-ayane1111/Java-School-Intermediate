import java.util.Scanner;

public class ComprehensiveIntermediate01_03 {
    public static void main(String[] args) {

        double a, b, c, D;
        Scanner sc = new Scanner(System.in);
        System.out.println("数字を入力してください");

        System.out.print("a=");
        a = sc.nextInt();
        System.out.print("b=");
        b = sc.nextInt();
        System.out.print("c=");
        c = sc.nextInt();

        D = b * b - 4 * a * c;

        if (D > 0) {
            System.out.print("実数解です");
        } else if (D < 0) {
            System.out.print("虚数解です");
        } else
            System.out.print("重解です");

    }
}
