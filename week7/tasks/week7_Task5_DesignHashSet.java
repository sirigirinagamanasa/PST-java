
class MyHashSet {
    boolean[] set = new boolean[1000001];

    public void add(int key) {
        set[key] = true;
    }

    public void remove(int key) {
        set[key] = false;
    }

    public boolean contains(int key) {
        return set[key];
    }
}

public class week7_Task5_DesignHashSet {
    public static void main(String[] args) {
        MyHashSet set = new MyHashSet();

        set.add(5);
        set.add(10);

        System.out.println(set.contains(5));
        System.out.println(set.contains(3));

        set.remove(5);

        System.out.println(set.contains(5));
    }
}
