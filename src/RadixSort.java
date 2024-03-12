import java.util.*;

public class RadixSort {
    public static void main(String[] args) {
        String[] input = {"gojo", "google", "jogo", "bill", "pup", "cipher", "watchmen", "knight", "it", "stand", "sandman", "hydra", "surtr"};
        radixSort(input);
        for (String s : input) {
            System.out.print(s + ", ");
        }
    }

    public static void radixSort(String[] arr) {
        final int RADIX = 52; // 26 for lowercase letters + 26 for uppercase letters
        List<String>[] buckets = new LinkedList[RADIX];
        for (int i = 0; i < RADIX; i++) {
            buckets[i] = new LinkedList<>();
        }

        // Find the maximum length of strings
        int maxLength = 0;
        for (String s : arr) {
            maxLength = Math.max(maxLength, s.length());
        }

        // Apply counting sort for each character from right to left
        for (int digit = maxLength - 1; digit >= 0; digit--) {
            for (String s : arr) {
                int index;
                if (digit < s.length()) {
                    char ch = s.charAt(digit);
                    if (Character.isLowerCase(ch)) {
                        index = ch - 'a';
                    } else {
                        index = ch - 'A' + 26; // uppercase letters start from 26 index
                    }
                } else {
                    index = 0; // if the string length is smaller than digit
                }
                buckets[index].add(s);
            }

            int i = 0;
            for (List<String> bucket : buckets) {
                for (String s : bucket) {
                    arr[i++] = s;
                }
                bucket.clear();
            }
        }
    }

}