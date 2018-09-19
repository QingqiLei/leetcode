package array;

/**
 * return an array consisting of all the even elements of A followed by all the odd elements of A
 */
public class SortArrayByParity905 {
    public int[] sortArrayByParity(int[] A){
        int[] result = new int[A.length];
        for(int i = 0, even = 0, odd = 0; i < A.length; i ++){
            if(A[i]%2 == 0)
                result[even++] = A[i];
            else
                result[A.length-odd++ -1]=A[i];
        }
        return result;
    }
}
