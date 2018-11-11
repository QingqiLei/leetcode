package IntString.easy;

public class Base7504 {
    public String convertToBase7(int num) {
        if(num < 0) return "-" + convertToBase7(-num);
        if(num < 7) return num + "";
        return convertToBase7(num /7) + num % 7;
    }
}
