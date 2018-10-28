package array.easy;

/**
 * find the smallest element in the list that is larger than the given target.
 * <p>
 * Letters also wrap around.
 */
public class FindSmallestLetterGreaterThanTarget744 {
    public char nextGreatestLetter(char[] letters, char target) {
        for (char c : letters) {
            if ((c - target) > 0) return c;

        }
        return letters[0];
    }


}
