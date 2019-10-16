package stack.monotone;

public class Largest1BorderedSquare1139 {
    public static int dayOfYear(String date) {
        int month = Integer.valueOf(date.substring(5,7));
        int day   = Integer.valueOf(date.substring(8,10));
        int year = Integer.valueOf(date.substring(0, 4));
        int[] datess = new int[]{year, month, day};
        boolean more = false;
        if(datess[0] %4 == 0 && datess[0] % 100 != 0){
            more = true;
        }else if(datess[0] % 400 == 0) more = true;




        int[] months = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
        int res = 0;
        for(int i = 1; i<month; i++){
            res+= months[i-1];
        }
        if(month >2 && more) res ++;
        return res + day;
    }

    public static void main(String[] args){
        System.out.println(dayOfYear("2002-03-01"));
        ;
    }

    public int largest1BorderedSquare(int[][] grid) {
        if (grid.length == 0) return 0;
        int[][] top = new int[grid.length + 1][grid[0].length + 1];
        int[][] left = new int[grid.length + 1][grid[0].length + 1];
        int dist, max = 0;
        for (int r = 1; r <= grid.length; r++)
            for (int c = 1; c <= grid[0].length; c++) {
                if (grid[r - 1][c - 1] == 0) continue;
                top[r][c] = top[r - 1][c] + 1;
                left[r][c] = left[r][c - 1] + 1;
                dist = Math.min(top[r][c], left[r][c]);
                for (int i = dist; i >= 1; i--) {
                    System.out.println(i);
                    if (top[r][c - i + 1] >= i && left[r - i + 1][c] >= i) {
                        max = Math.max(max, i * i);
                        break;
                    }
                }
            }
        return max;
    }
}
