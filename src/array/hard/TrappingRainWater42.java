package array.hard;

public class TrappingRainWater42 {
    public int trap(int[] h) {
        int left = 0, right = h.length - 1, leftMax = 0, rightMax = 0, res = 0;
        while (left < right) {
            leftMax = Math.max(leftMax, h[left]);
            rightMax = Math.max(rightMax, h[right]);
            if (leftMax < rightMax) {
                res += leftMax - h[left];
                left++;
            } else {
                res += rightMax - h[right];
                right--;
            }
        }
        return res;
    }
}
