public class ArraySortedNaiveApproach {
    //This approach has the Time Complexity of O(n^2)
    static boolean isSorted(int[] arr){

        for(int i = 0;i<arr.length;i++) // traversing through elements
            for(int j =i+1 ; j<arr.length;j++) //checking all elements on the right side.
                if(arr[j] <arr[i])
                    return false;
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {9, 10, 12, 13, 20};
        System.out.println(isSorted(arr));

    }
}
