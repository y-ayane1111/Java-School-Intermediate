public class ComprehensiveIntermediate02_05 {
    public static void main(String[] args) {
        // Juiceのインスタンス
        Juice juice1 = new Juice("バヤリース", "オレンジ", 130);
        Juice juice2 = new Juice("午後の紅茶", "レモンティー", 150);

        // Coffeeのインスタンス
        Coffee coffee1 = new Coffee("ボス", "控え目", "無し", 110);
        Coffee coffee2 = new Coffee("ジョージア", "甘め", "入れ", 120);

        // Juice,Coffeeクラスから呼び出す
        juice1.buyDrink();
        juice2.buyDrink();
        coffee1.buyDrink();
        coffee2.buyDrink();
    }

}

// Juiceクラス
class Juice {
    String name;
    String flavor;
    int price;

    public Juice(String name, String flavor, int price) {
        this.name = name;
        this.flavor = flavor;
        this.price = price;
    }

    public void buyDrink() {
        System.out.println(name + " の " + flavor + " 味です。" + price + " 円になります。");
    }
}

// Coffeeクラス
class Coffee {
    String name;
    String sweet;
    String milk;
    int price;

    public Coffee(String name, String sweet, String milk, int price) {
        this.name = name;
        this.sweet = sweet;
        this.milk = milk;
        this.price = price;
    }

    public void buyDrink() {
        System.out.println(name + " の甘さは " + sweet + "、" + "ミルク " + milk + "です。 " + price + " 円になります。");
    }
}