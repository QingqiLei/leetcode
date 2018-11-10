package array.easy;

/**
 * Given an array A of non-negative integers, half of the integers in A are odd, and half of the integers are even.
 *
 * Sort the array so that whenever A[i] is odd, i is odd; and whenever A[i] is even, i is even.
 *
 * You may return any answer array that satisfies this condition.
 */
public class SortArrayByParityII922 {
    public int[] sortArrayByParityII(int[] A) {
        for(int even = 0,  odd = 1;  even < A.length && odd<A.length ;  ){
            while(A[even] %2 == 0) even +=2;
            while(A[odd] %2 ==1)  odd +=2;
            if(even >= A.length || odd >= A.length) continue;
            int temp = A[even];
            A[even] = A[odd];
            A[odd] = temp;
            even +=2;
            odd +=2;
        }
        return A;
    }
}