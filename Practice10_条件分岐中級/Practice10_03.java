import java.util.Random;

public class Practice10_03 {
    public static void main(String[] args) {
        Random rand = new Random();
        int age = rand.nextInt(21);
        int gender = rand.nextInt(2);

        switch (age) {
            case 0, 1, 2, 3:
                switch (gender) {
                    case 0:
                        System.out.println("あなたはbabyな男です");
                        break;
                    case 1:
                        System.out.println("あなたはbabyな女です");
                        break;
                }
                break;

            case 4, 5:
                switch (gender) {
                    case 0:
                        System.out.println("あなたはchildな男です");
                        break;
                    case 1:
                        System.out.println("あなたはchildな女です");
                        break;
                }
                break;

            case 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17:
                switch (gender) {
                    case 0:
                        System.out.println("あなたはkidな男です");
                        break;
                    case 1:
                        System.out.println("あなたはkidな女です");
                        break;
                }
                break;

            default:
                switch (gender) {
                    case 0:
                        System.out.println("あなたはadultな男です");
                        break;
                    case 1:
                        System.out.println("あなたはdultな女です");
                        break;

                }
        }
    }

}
