package Math.easy;

public class LargestTimeforGivenDigits949 {
    public String largestTimeFromDigits(int[] A){
        int max = -1;
        for(int i0 = 0; i0 < 4; i0++)
            for(int i1 = 0;i1 < 4; i1++)
                for(int i2 = 0;i2 < 4; i2++) {
                    if (i0 == i1 || i1 == i2 || i2 == i0) continue;
                    int hour = A[i0] * 10 + A[i1];
                    int minute = A[i2] * 10 + A[6 - i0 - i1 - i2];
                    if (hour < 24 && minute < 60) {
                        int temp = hour*100 + minute;
                        max = Math.max(max, temp);
                    }
                }
        if(max == -1) return "";
        return max/1000 +""+max/100%10+":"+max%100/10+max%100%10;
    }
}
