package IntString.easy;

public class DetectCapital520 {
    public boolean detectCapitalUse(String word) {
        return word.matches("[A-Z]|[a-z]|[A-Z][a-z]");
    }

    public static void main(String[] args){
        System.out.println("".matches("\\d*"));
    }
}