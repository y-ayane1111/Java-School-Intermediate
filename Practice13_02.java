class Shop {
    String name;
    int sale;

    public static void ShopSale(int sale) {

        System.out.println("売上:" + sale);
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
        System.out.println(s1.name);
        s1.ShopSale(s1.sale);
        System.out.println(s2.name);
        s2.ShopSale(s2.sale);
    }
}