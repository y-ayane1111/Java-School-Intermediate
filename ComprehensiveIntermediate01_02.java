import java.util.Scanner;

public class ComprehensiveIntermediate01_02 {
    public static void main(String[] args) {
        System.out.println("3つの整数を入力してください");

        Scanner sc = new Scanner(System.in);

        int valum1 = sc.nextInt();
        int valum2 = sc.nextInt();
        int valum3 = sc.nextInt();

        if (valum1 <= valum2 && valum2 <= valum3) {
            System.out.println("Ok");
        } else {
            System.out.println("NG");
        }
    }
}
