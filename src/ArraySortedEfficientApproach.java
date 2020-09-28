public class ArraySortedEfficientApproach {
    //This approach has the Time Complexity of O(n)
    static boolean isSorted(int[] arr){
        for(int i=1;i<arr.length;i++)
            if(arr[i] < arr[i-1]) {
                return false;
            }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {9, 10, 12, 13, 20};
        System.out.println(isSorted(arr));
    }
}
