import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Practice15_02 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("kudo");
        list.add("mitoma");
        list.add("kamada");
        list.add("kamada");

        Set<String> set = new TreeSet<String>(list);
        for (String s : set) {
            System.out.println(s);
        }

    }

}
