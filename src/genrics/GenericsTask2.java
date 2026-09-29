package genrics;

class Pair<K, V> {
    K key;
    V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }
    public V getValue() {
        return value;
    }
}

public class GenericsTask2 {
    static void main() {
        Pair<Integer, String> p1 = new Pair<>(101, "Kaveen");
        Pair<String, Double> p2 = new Pair<>("Salary", 2000.0987);

        System.out.println("Key: " + p1.getKey() + "  |  " + "Value: " + p1.getValue());
        System.out.println("Key: " + p2.getKey() + "  |  " + "Value: " + p2.getValue());
    }
}
