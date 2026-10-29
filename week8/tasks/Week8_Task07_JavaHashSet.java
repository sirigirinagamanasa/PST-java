
import java.util.HashSet;
import java.util.Set;

public class Week8_Task07_JavaHashSet {
    public static void main(String[] args) {
        Set<String> pairs = new HashSet<>();

        pairs.add("1,2");
        pairs.add("3,4");
        pairs.add("1,2");
        pairs.add("5,6");

        System.out.println("Unique pairs: " + pairs.size());

        for (String pair : pairs) {
            System.out.println(pair);
        }
    }
}

