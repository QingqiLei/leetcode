package array.easy;

/**
 *Suppose you have a long flowerbed in which some of the plots are planted and some are not. However, flowers cannot be planted in adjacent plots - they would compete for water and both would die.
 */
public class CanPlaceFlowers605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length && n >= 0; i++) {
            if (flowerbed[i] == 1) continue;
            //     if i == 0 or the last element == 0      and i is the last element
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                n--;
                flowerbed[i] = 1;
            }
        }
        return n <= 0;
    }
}
/**
 * a greedy solution, 需要知道尽量选择好的位置种花，如00001，可以选为01001，也可以10101.
 * 原则就是贪婪，尽可能选择靠近两边的
 */
