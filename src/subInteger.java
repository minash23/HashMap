import java.util.HashMap;

public class subInteger {
    public static void main(String[] args) {
        // Sample Input
        int[] T1 = {32, 3};
        int[] S1 = {1, 2, 3, 52, 32, 54};
        System.out.println(isSubset(T1, S1)); // Sample Output: Yes

        int[] T2 = {89, 32, 54, 32, 3};
        int[] S2 = {54, 32, 99};
        System.out.println(isSubset(T2, S2)); // Sample Output: No
    }

    public static String isSubset(int[] T, int[] S) {

        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int i = 0; i < S.length; i++) {
            map.put(S[i], true);
        }

        for (int i = 0; i < T.length; i++) {
            if (!map.containsKey(T[i])) {
                return "No";
            }
        }
        return "Yes";
    }
}
