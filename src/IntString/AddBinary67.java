package IntString;

public class AddBinary67 {
    public static String addBinary(String a, String b){
        StringBuilder sb = new StringBuilder();

        int i= a.length()-1, j = b.length()-1, carry = 0;

        while( i >=0||j >=0){
            int sum = carry;
            if(j >=0) sum += b.charAt(j--) -'0';
            if(i >=0) sum += b.charAt(i--) -'0';

            sb.append(sum % 2);
            carry = sum /2;

        }
        if(carry != 0) sb.append(carry);
        return sb.reverse().toString();
    }
    public static void main(String[] args){
        System.out.println(addBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101","10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101"));

    }
}

//"10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101"
//        "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"
