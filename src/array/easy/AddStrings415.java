package array.easy;

public class AddStrings415 {
    public static String addStrings(String num1, String num2) {
        StringBuilder sb1 = new StringBuilder(num1);
        StringBuilder sb2 = new StringBuilder(num2);
        StringBuilder ans = new StringBuilder("");
        int plus = 0;

        while(sb1.length() != 0 && sb2.length()!= 0 ){
            int num = sb1.charAt(sb1.length()-1)-'0' + sb2.charAt(sb2.length()-1)-'0';
            ans.insert(0,(num+plus)%10);
            plus = (num+plus)/10;
            sb1.deleteCharAt(sb1.length()-1);
            sb2.deleteCharAt(sb2.length()-1);

        }
        while(sb1.length() !=0){
            int num = sb1.charAt(sb1.length()-1) -'0';
            ans.insert(0,(num+plus)%10);
            plus = (num+plus)/10;
            sb1.deleteCharAt(sb1.length()-1);
        }
        while(sb2.length() !=0){
            int num = sb2.charAt(sb2.length()-1)-'0' ;
            ans.insert(0,(num+plus)%10);
            plus = (num+plus)/10;
            sb2.deleteCharAt(sb2.length()-1);
        }
        if(plus != 0)
            ans.insert(0,plus);
        return ans.toString();
    }
    public static void main(String[] args){
        System.out.println(addStrings("9","99"));
    }
}
