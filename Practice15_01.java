import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Practice15_01 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("kudo");
        list.add("mitoma");
        list.add("kamada");
        list.add("kamada");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
