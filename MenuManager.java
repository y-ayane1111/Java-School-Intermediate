import java.util.*;

public class MenuManager {

    Map<String, ArrayList<String>> map = new HashMap<>();

    MenuManager() {
        // サンドイッチメニューの登録
        ArrayList<String> list = new ArrayList<>();
        list.add("ハンバーガー");
        list.add("チーズバーガー");
        list.add("ダブルチーズバーガー");
        map.put("sandwitch", list);
        // ドリンクメニューの登録
        list = new ArrayList<>();
        list.add("コーラ");
        list.add("オレンジジュース");
        list.add("コーヒー");
        map.put("drink", list);
        // サイドメニューの登録
        list = new ArrayList<>();
        list.add("フライドポテト");
        list.add("チキンナゲット");
        list.add("アップルパイ");
        map.put("sidemenu", list);
    }

    protected void searchMenu(String menu) {
        for (String key : map.keySet()) {
            if (map.get(key).contains(menu)) {
                System.out.println(menu + "は" + key + "に含まれ稀ています。");
                return;
            }
        }
        System.out.println("該当するメニューはありません。");
    }

    protected void setMenu(String category, String menu) {
        map.get(category).add(menu);
    }

    protected void showMenu(String category) {
        System.out.println(map.get(category));
    }

}