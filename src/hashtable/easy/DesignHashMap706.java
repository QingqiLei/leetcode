package hashtable.easy;

import java.util.Arrays;
// length known
public class DesignHashMap706 {
    int[] array = new int[1000000];

    /**
     * Initialize your data structure here.
     */
    public DesignHashMap706() {
        Arrays.fill(array, -1);
    }

    /**
     * value will always be non-negative.
     */
    public void put(int key, int value) {
        array[key] = value;
    }

    /**
     * Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key
     */
    public int get(int key) {
        return array[key];
    }

    /**
     * Removes the mapping of the specified value key if this map contains a mapping for the key
     */
    public void remove(int key) {
        array[key] = -1;
    }
}
