import java.util.HashMap;
import java.util.Map;

public class ComprehensiveIntermediate02_01 {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("国語", 90);
        map.put("数学", 80);
        map.put("英語", 70);

        for (String key : map.keySet()) {
            System.out.println(key + ":" + map.get(key));
        }
    }
}