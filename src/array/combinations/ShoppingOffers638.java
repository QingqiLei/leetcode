package array.combinations;

import java.util.ArrayList;
import java.util.List;

// try every possibilities
public class ShoppingOffers638 {
    public int shoppingOffers(List<Integer> p, List<List<Integer>> s, List<Integer> n) {
        return helper(0, s, p, n);
    }

    private int helper(int pos, List<List<Integer>> sprcial, List<Integer> price, List<Integer> needs) {
        int minPrice = 0;
        for (int i = 0; i < price.size(); i++)
            minPrice += needs.get(i) * price.get(i);

        for (int s = pos; s < sprcial.size(); s++) {
            List<Integer> offer = sprcial.get(s);
            List<Integer> tmp = new ArrayList();

            for (int i = 0; i < price.size(); i++) {
                if (offer.get(i) > needs.get(i)) {
                    tmp = null;
                    break;
                } else
                    tmp.add(needs.get(i) - offer.get(i));
            }
            if (tmp != null)
                minPrice = Math.min(minPrice, offer.get( price.size()) + helper(s, sprcial, price, tmp));
        }
        return minPrice;
    }
}

