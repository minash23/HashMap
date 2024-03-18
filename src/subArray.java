public class subArray {
    public static void main(String[] args){
        int[] array = {1, 2, 3, 7, 5};

        int[] ans = subArray(array, 10);
        System.out.println(ans[0]);
        System.out.println(ans[1]);
    }


    public static int[] subArray(int[] array, int target){
        int[] two = new int[2];

        for(int i = 0; i < array.length; i++){
            if(array[i] == target){
                two[0] = i;
                two[1] = i;
                return two;
            }
        }
        int currentSum2 = 0;
        for(int i = 0; i < array.length; i++){
            currentSum2 = array[i];

            for(int j = i + 1; j < array.length; j++){
                currentSum2 += array[j];
                if(currentSum2 == target){
                    two[0] = i;
                    two[1] = j;
                    return two;
                }
            }
        }
        two[0] = -1;
        two[1] = -1;
        return two;
    }
}
