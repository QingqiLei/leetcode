package array.medium;

/**
 *In LOL world, there is a hero called Teemo and his attacking can make his enemy Ashe be in poisoned condition. Now, given the Teemo's attacking ascending time series towards Ashe and the poisoning time duration per Teemo's attacking, you need to output the total time that Ashe is in poisoned condition.
 *
 * You may assume that Teemo attacks at the very beginning of a specific time point, and makes Ashe be in poisoned condition immediately.
 */
public class TeemoAttacking495 {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int ans = 0, last = 0;
        for(int t:timeSeries){
            ans +=duration;
            if(last > t) ans -= (last -t);
            last = t+duration;
        }
        return ans;
    }
}
