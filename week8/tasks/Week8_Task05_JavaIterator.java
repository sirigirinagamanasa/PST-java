
import java.util.ArrayList;
import java.util.Iterator;

public class Week8_Task05_JavaIterator {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Ravi");
        names.add("Sita");
        names.add("Arun");

        Iterator<String> it = names.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

