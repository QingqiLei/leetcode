package array.medium;

/**
 * Given an array A, partition it into two (contiguous) subarrays left and right so that:
 *
 * Every element in left is less than or equal to every element in right.
 * left and right are non-empty.
 * left has the smallest possible size.
 * Return the length of left after such a partitioning.  It is guaranteed that such a partitioning exists.
 */
public class PartitionArrayintoDisjointntervals915 {
    public int partitionDisjoint(int[] A) {
        int localMax = A[0], partitionIndex = 0, soFarMax = A[0];
        for(int i = 0; i < A.length; i ++){
            if(localMax > A[i]){ //
                localMax = soFarMax;
                partitionIndex = i;
            }else soFarMax = Math.max(soFarMax,A[i] );

        }
        return partitionIndex +1;

    }
}
