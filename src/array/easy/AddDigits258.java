package array.easy;

/**
 * Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
 */
public class AddDigits258 {
    public int addDigits(int num) {
        if(num == 0)
            return 0;
        if(num % 9 == 0)
            return 9;
        return num %9;
    }
}
