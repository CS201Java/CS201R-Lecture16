
//EXAMPLE 6: Generic Class with 2 Types  
public class Pair<K extends Comparable<K>, V> implements Comparable <Pair<K,V>> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey()   { return key; }
    public V getValue() { return value; }

    @Override
    public int compareTo(Pair<K, V> other) {
        return key.compareTo(other.key);
    }
}