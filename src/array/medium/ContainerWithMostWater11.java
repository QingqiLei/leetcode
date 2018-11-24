package array.medium;

public class ContainerWithMostWater11 {
    public int maxArea(int[] height) {
        int ans = 0;
        for (int left = 0, right = height.length - 1; left < right; ) {
            ans = Math.max(ans, (right - left) * Math.min(height[left], height[right]));

            if (height[left] > height[right]) right--;
            else if (height[left] < height[right]) left++;
            else {
                right--;
                left++;
            }
        }
        return ans;
    }
}
