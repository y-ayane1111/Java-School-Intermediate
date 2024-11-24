class Shop {
    String name = "店名";
    int sale;

    public void Sales(int sale) {
    }
}

public class Practice13_02 {
    public static void main(String[] args) {

        Shop s1 = new Shop();
        Shop s2 = new Shop();
        s1.name = "おもちゃ屋さん";
        s1.sale = 200000;
        s2.name = "スポーツショップ";
        s2.sale = 550000;
        System.out.println(s1.name + "売上:" + s1.sale);
        System.out.println(s2.name + "売上:" + s2.sale);
    }
}