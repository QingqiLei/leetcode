package array;

/**
 * A matrix is Toeplitz if every diagonal from top-left to bottom-right has the same element.
 */
public class ToeplitzMatrix766 {
    public static boolean isToeplitzMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            int height = i;
            int width = 0;
            int temp = matrix[i][0];

            while (height + 1 < matrix.length && width + 1 < matrix[0].length)
                if (matrix[++height][++width] != temp)
                    return false;
        }


        for (int i = 0; i < matrix[0].length; i++) {
            int height = 0;
            int width = i;
            int temp = matrix[0][i];

            while (height + 1 < matrix.length && width + 1 < matrix[0].length)
                if (matrix[++height][++width] != temp)
                    return false;
        }
        return true;

    }

    public static void main(String[] args) {
        int[][] array = {{18}, {66}};
        System.out.println(isToeplitzMatrix(array));

    }
}
