import java.util.Random;

public class Practice11_03 {
    public static void main(String[] args) {

        int X = 1;
        while (X <= 10) {
            Random rand = new Random();
            int num = rand.nextInt(6) + 1;

            if (num % 2 == 1) {
                System.out.println(X + "回目、" + num + "が出ました");
                X++;
            }
        }
    }
}
