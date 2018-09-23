package IntString;

/**
 * Given two strings A and B, find the minimum number of times A has to be repeated such that B is a substring of it. If no such solution, return -1.
 */
public class RepeatedStringMatch686 {
    public int repeatedStringMatch(String A, String B) {
        int times = B.length() / A.length();
        String AA = "";
        for (int i = 0; i < times; i++) {
            AA += A;
        }
        return AA.contains(B) ? times : ((AA + A).contains(B) ? times + 1 : (((AA + A + A)).contains(B) ? times + 2 : -1));
    }
}
