package bitoperation.easy;

/**
 * Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.
 */
public class SumofTwoIntegers371 {
    public int getSum(int a, int b) {
//        return b == 0? a:getSum(a ^ b, (a & b) <<1);
        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }
}
