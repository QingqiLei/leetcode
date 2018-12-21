package IntString.medium;



public class PushDominoes838 {
    public static String pushDominoes1(String dominoes) {
        String s1 = dominoes;
        while(true){
            String s2 = s1;
            System.out.println(s2);
            if(s2.indexOf("R.L") != -1) s2 = s2.replaceAll("R\\.L", "S");
            System.out.println(s2);
            if(s2.indexOf(".L") != -1) s2 = s2.replaceAll("\\.L","LL");
            System.out.println(s2);
            if(s2.indexOf("R.") != -1) s2 = s2.replaceAll("R\\.", "RR");
            System.out.println(s2);
            if(s2 == (s1)) break;
            s1 = s2;

        }
        return s1.replaceAll("S","R.L");
    }
// O(N)
    public static String pushDominoes(String dominoes) {
        StringBuilder res = new StringBuilder("");
        String s = "L" + dominoes + "R";
        for(int i = 0,j = 1; j < s.length() ; j++){
            if(s.charAt(j) == '.') continue;
            if(i != 0) res.append(s.charAt(i));
            int numsInMid = j - i -1;
            if(s.charAt(j) == s.charAt(i)){
                for(int k = 0; k < numsInMid;k ++) res.append(s.charAt(i));
            }else if(s.charAt(i) =='L' && s.charAt(j) == 'L')
                for(int k = 0; k < numsInMid; k++) res.append('.');
                else if(s.charAt(i) == 'R' && s.charAt(j) == 'L'){
                    int valid = numsInMid/2;
                    for(int k = 0; k < valid; k++) res.append('R');
                    res.append('.');
                    for(int k = 0; k < valid; k++) res.append('L');
            }

        }
        return new String(res);
    }

    public static void main(String[] args){
        pushDominoes(".L.R...LR..L..");
//        System.out.println("LL.RR.LLRRLL..".replaceAll("R\\.L", "S"));
    }
}
