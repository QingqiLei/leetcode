package array.combinations;

import java.util.ArrayList;
import java.util.List;

// try every possibilities
public class ShoppingOffers638 {
    public int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
        return helper(0, special, price, needs);
    }
    private int helper(int pos, List<List<Integer>> special, List<Integer> price, List<Integer> needs) {
        int minPrice=0, n=price.size();

        //1. for individual prices
        for(int i=0;i<n;i++) {
            minPrice+=price.get(i)*needs.get(i);
        }

        //2. try to get the offer
        for(int s=pos;s<special.size();s++) {
            List<Integer> offer=special.get(s);
            List<Integer> tmp=new ArrayList<>(); // for new needs !

            for(int i=0;i<n;i++) {
                if(offer.get(i)>needs.get(i)) {
                    tmp=null;
                    break;
                }else{
                    tmp.add(needs.get(i)-offer.get(i));
                }
            }

            if(tmp!=null) {
                minPrice=Math.min(minPrice, offer.get(n)+helper(s,special,price,tmp));
            }
        }

        return minPrice;
    }
}

