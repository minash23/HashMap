import java.util.Arrays;

public class SubarraySum {
    public static int[] sumTarget(int[] A, int K) {
        if (A == null || A.length == 0) {
            return new int[]{-1, -1};
        }

        int start = 0;
        int end = 0;
        int currentSum = 0;

        while (end < A.length) {
            currentSum += A[end];

            while (currentSum > K && start <= end) {
                currentSum -= A[start];
                start++;
            }

            if (currentSum == K) {
                return new int[]{start, end};
            }

            end++;
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 7, 5};
        int K = 12;
        System.out.println(Arrays.toString(sumTarget(A, K)));

        A = new int[]{1, 2, 3, 7, 5};
        K = 5;
        System.out.println(Arrays.toString(sumTarget(A, K)));

        A = new int[]{1, 2, 3, 7, 5};
        K = 7;
        System.out.println(Arrays.toString(sumTarget(A, K)));

        A = new int[]{1, 2, 3, 7, 5};
        K = 11;
        System.out.println(Arrays.toString(sumTarget(A, K)));
    }
}
