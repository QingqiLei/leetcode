package dp.updateEveryTime;
/*
No.549. Binary Tree Longest Consecutive Sequence II
for each element in the array or on  in the tree, they all carry three fields:
1. the maximum increasing /decreasing lenth ends at the current element
2. its own value
3. the total number of maximum lenth,
each time when we visit a element, we update 1, 3 by using 2,
use iteration for array, recursion for tree.
for substring problem, we usually use only one for loop because for each index,
we only care about the relationship between its two neighbors, while for subsequence problem,
we use two for loops, because for each index, any other indexes can do something
 */
public class NumberofLongestIncreasingSubsequence673 {
    // O(N^2)
    public int findNumberOfLIS(int[] nums){
        int n = nums.length,res = 0, max_len = 0;
        int[] len = new int[n], cnt  = new int[n];
        for(int i = 0; i < n; i ++){
            len[i] = cnt[i] = 1;
            for(int j = 0 ; j < i; j++){
                if(nums[i] > nums[j]){
                    if(len[i] == len[j] +1) cnt[i] += cnt[j];
                    if(len[i] < len[j] +1){
                        len[i] = len[j] +1;
                        cnt[i] = cnt[j];
                    }
                }
            }
            if(max_len == len[i] ) res += cnt[i];
            if(max_len < len[i]) {
                max_len = len[i];
                res = cnt[i];
            }
        }
        return res;
    }
}
