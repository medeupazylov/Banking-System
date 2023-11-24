package csci235;

import java.util.ArrayList;
import java.util.List;

public class HashTableMap<K, V> implements Map<K, V> {

    private class KVPair {
        public K key;
        public V value;

        KVPair(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private List<KVPair>[] buckets;

    private int size;

    public HashTableMap(int numBuckets) {
        this.buckets = new ArrayList[numBuckets];
        for (int i = 0; i < numBuckets; i++) {
            this.buckets[i] = new ArrayList<>();
        }
        this.size = 0;
    }

    private int getIndex(K key) {
        return Math.abs(key.hashCode()) % this.buckets.length;
    }

    private double loadFactor() {
        return (double) size / this.buckets.length;
    }

}


