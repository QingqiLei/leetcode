package array.ilike;

public class MergeSortedArray88 {
    public void merge(int A[], int m, int B[], int n) {
        int i = m-1, j = n-1,k = m+n-1;
        while(i>=0 && j >=0)  A[k--] = A[i]>B[j]?A[i--]:B[j--];
        /**
         * it doesn't weather i == 0 or not, we make sure  j == 0,
         * because B is another array, A is the array we return, we need put all the elements in B on A
          */
        while(j>=0) A[k--] = B[j--];
    }
}
