import java.util.Random;

public class Practice14_02 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomValue = random.nextInt(2);

        try {
            switch (randomValue) {
                case 0:
                    int num = 10 / 0;
                    System.out.println(num);
                    break;

                default:
                    String i = null;
                    System.out.println(i.length());
                    break;
            }

        } catch (ArithmeticException e) {
            System.out.println("計算例外をキャッチしました。");
        } catch (NullPointerException e) {
            System.out.println("ぬるぽをキャッチしました。");
        } finally {
            System.out.println("finally 計算終了");
        }
        System.out.println("処理終了");
    }
}
