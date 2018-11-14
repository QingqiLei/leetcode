package array.medium;

/**
 * Given an array arr that is a permutation of [0, 1, ..., arr.length - 1], we split the array into some number of "chunks" (partitions), and individually sort each chunk.  After concatenating them, the result equals the sorted array.
 *
 * What is the most number of chunks we could have made?
 */
public class MaxChunksToMakeSorted769 {
    public int maxChunksToSorted(int[] arr) {
        if(arr == null) return 0;
        int max = 0, count = 0;
        for(int i = 0; i < arr.length; i++){
            max = Math.max(max,arr[i]);
            if(max == i) count ++;
        }
        return count;
    }
}
