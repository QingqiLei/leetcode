package IntString.medium;
/*
We are given an array A of N lowercase letter strings, all of the same length.

Now, we may choose any set of deletion indices, and for each string, we delete all the characters in those indices.

For example, if we have an array A = ["abcdef","uvwxyz"] and deletion indices {0, 2, 3}, then the final array after deletions is ["bef","vyz"].

Suppose we chose a set of deletion indices D such that after deletions, the final array has its elements in lexicographic order (A[0] <= A[1] <= A[2] ... <= A[A.length - 1]).

Return the minimum possible value of D.length.


 */
public class DeleteColumnstoMakeSortedII955 {
    public int minDeletionSize(String[] A) {
        boolean sorted[] = new boolean[A.length];
        int res = 0;
        for(int col = 0; col < A[0].length(); col++){
            boolean valid = true;
            for(int i = 1; i < A.length; i++){
                if(sorted[i]) continue;
                if(A[i-1].charAt(col) > A[i].charAt(col)){
                    res++;
                    valid = false;
                    break;
                }
            }

            if(valid){
                for(int i = 1; i < A.length; i++){
                    if(sorted[i] ) continue;
                    if(A[i-1].charAt(col) < A[i].charAt(col))
                        sorted[i] = true;
                }
            }
        }
        return res;

    }
}