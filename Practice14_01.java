public class Practice14_01 {
    public static void main(String[] args) {
        StringLength(null);
    }

    static void StringLength(String str) {
        try {

            int i = str.length();
            System.out.println(str + "は" + i + "文字");
        } catch (NullPointerException e) {
            System.out.println("ぬるぽをキャッチしました。");
        } finally {
            System.out.println("finally ブロックです。");
        }
        System.out.println("処理終了");

    }
}
