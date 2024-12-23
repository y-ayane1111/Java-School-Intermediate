import java.util.Scanner;

public class ComprehensiveIntermediate01_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("人数を入力してください >");
        int people = sc.nextInt();

        number(people);
    }

    public static void number(int people) {
        if (people > 5) {
            System.out.println("料金は" + (people * 600) + "円です");

        } else if (people <= 20) {
            System.out.println("料金は" + (people * 500) + "円です");
        } else {
            System.out.println("料金は" + (people * 550) + "円です");
        }
    }
}