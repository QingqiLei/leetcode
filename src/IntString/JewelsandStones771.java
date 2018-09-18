package IntString;

public class JewelsandStones771 {
    public int numJewelsInStones(String J, String S) {
        return S.replaceAll("[^" + J + "]", "").length();
    }
}
