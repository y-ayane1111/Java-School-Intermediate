import java.util.Scanner;

public class Practice11_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNum;
        do {

            System.out.print("何段> ");
            inputNum = sc.nextInt();
        } while (inputNum > 5 || inputNum < 1);
        for (int i = 1; i <= inputNum; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
