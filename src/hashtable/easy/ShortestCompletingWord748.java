package hashtable.easy;

/**
 *
 */
public class ShortestCompletingWord748 {
    private static final int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103};

    public String shortestCompletingWord(String licensePlate, String[] words) {
        long licenseID = getCharProduct(licensePlate.toLowerCase());

        String shortest = "aaaaaaaaaaaaaaaa";
        for(String string: words)
            if(string.length() < shortest.length() && getCharProduct(string.toLowerCase()) % licenseID == 0)
                shortest = string;

        return shortest;
    }

    private long getCharProduct(String plate) {
        long product = 1L;
        for(char c : plate.toCharArray()) {
            int index = c - 'a';
            if (0 <= index && index <= 25)
                product *= primes[index];
        }
        return product;
    }

}
