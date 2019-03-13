package array.hard;

// O(1)
public class FirstMissingPositive41 {
    public static int firstMissingPositive(int[] A) {
        int i = 0;
        while (i < A.length) {
            if (A[i] >= 1 && A[i] <= A.length && A[A[i] - 1] != A[i]) swap(A, i, A[i] - 1);
            else i++;
        }

        i = 0;
        while (i < A.length && A[i] == i + 1)
            i++;
        return i + 1;
    }

    private static void swap(int[] A, int i, int j) { // make
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    public static void main(String[] args) {
        firstMissingPositive(new int[]{3, 4, -1, 1});
    }

}
