package binarysearch.easy;

public class Sqrt69 {
    public static int mySqrt(int x) {
        long left = 0, right = x;
        while (left <= right) {  // when the loop is over without returning, the right < left, and
            // right <  Sqrt(x) < left
            long mid = (right - left) / 2 + left;
            if (mid * mid > x)
                right = mid - 1;
            else if (mid * mid < x)
                left = mid + 1;
            else return (int) mid;
        }
        return (int) right;
    }

    public int mySqrt2(int x){
                    long r = x;
         while (r*r > x) //
             r = (r + x/r) / 2;
         return (int) r;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(432566));
    }

}
