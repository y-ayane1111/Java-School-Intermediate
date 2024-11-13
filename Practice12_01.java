public class Practice12_01 {
    public static void main(String[] args) {

        int x = 5;
        int y = 2;
        // 仮引数 x y、実引数 5,2

        int z = sumDown(x, y);

        System.out.println(x + "-" + y + "=" + z);
    }

    public static int sumDown(int x, int y) {
        return (x - y);

    }
}
