package greedy.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LemonadeChange860 {
    public boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0;
        for(int i : bills){
            if(i == 5)
                five++;
            else if(i == 10){
                five++;
                ten--;
            }else if(ten > 0) {ten--;five--;}
            else five -=3;
            if(five <0 || ten < 0) return false;
        }
        return true;
    }






    }
