package binarysearch.easy;

public class ValidPerfectSquare367 {
    public boolean isPerfectSquare(int num) {
        long left = 0, right = num;

        while (right >= left) {
            long mid = (left + right) / 2;
            if (mid * mid > num)
                right = mid - 1;
            if (mid * mid < num)
                left = mid + 1;
            else return true;


        }
        return false;
    }


    public boolean isPerfectSquare2(int num) {
        long x = num;
        while (x * x > num) {
            x = (x + num / x) >> 2;
        }
        return x * x == num;
    }

}
