package array.easy;

public class ExcelSheetColumnTitle168 {
    public String convertToTitle(int n) {
        StringBuilder ans = new StringBuilder("");
        while(n!=0){
            n--;
            int temp = n%26;
            n /=26;
            ans.append((char)(temp + 'A'));

        }
        return ans.reverse().toString();
    }
}
