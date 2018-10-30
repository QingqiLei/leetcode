package binarysearch.easy;

public class FirstBadVersion278 {
    public int firstBadVersion(int n) {
        int left = 0, right = n;
        while (right >= left) {
            int mid = (right - left) / 2 + left;
            if (isBadVersion(mid) == false)
                left = mid + 1;
            else if (isBadVersion(mid) == true)
                right = mid - 1;


        }

        return left;
    }

}
