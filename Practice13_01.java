class Animal {
    String name = "Jhon";
    String type = "nothing";

    /**
     * 動物に合わせて鳴き声を出力するメソッド
     *
     */
    public void cryAnimals(String type) {
        System.out.println(
                switch (type) {
                    case "cat" -> "nya-";
                    case "dog" -> "wan";
                    default -> "特定できませんでした";
                });
    }
}

public class Practice13_01 {
    public static void main(String[] args) {
        Animal a001 = new Animal();
        a001.name = "pochi";
        System.out.println(a001.name);
        a001.cryAnimals("dog");

        Animal a002 = new Animal();
        a002.name = "tama";
        System.out.println(a002.name);
        a002.cryAnimals("cat");
    }

}
