
public class Practice13_03 {
    public static void main(String[] args) {

        /* Greetingクラスからインスタンスを生成する */
        Greeting greetJapan = new Greeting();
        Greeting greetKorea = new Greeting();
        Greeting greetUnknown = new Greeting();

        String japan = "日本";
        String korea = "韓国";
        String unknown = "その他";

        greetJapan.country = japan;
        greetKorea.country = korea;
        greetUnknown.country = unknown;

        System.out.println(greetJapan.country + "は ");
        greetJapan.greet("日本");
        System.out.println(greetKorea.country + "は ");
        greetKorea.greet("韓国");
        System.out.println(greetUnknown.country + "は ");
        greetUnknown.greet("その他");

        /* 韓国、その他も同様に「System.out.println」を書く */
    }
}

class Greeting {
    String country;
    String greeting;

    public String greet(String greeting) {
        if (greeting.equals("日本")) {
            return "こんにちは";
        } else if (greeting.equals("韓国")) {
            return "アンニョンハセヨ";
        } else {
            return "わかりません";
        }
    }
}