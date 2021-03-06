package Math.medium;

public class MultiplyStrings43 {
    public String multiply(String num1, String num2) {
        int m = num1.length(), n = num2.length();
        int[] pos = new int[m + n];

        for (int i = m - 1; i >= 0; i--)
            for (int j = n - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int left = i + j, right = i + j + 1;
                int sum = mul + pos[right];

                pos[left] += sum / 10;
                pos[right] = sum % 10;

            }
        StringBuilder sb = new StringBuilder();
        for (int p : pos) if (sb.length() != 0 || p != 0) sb.append(p);
        return sb.length() == 0 ? "0" : sb.toString();
    }
}
