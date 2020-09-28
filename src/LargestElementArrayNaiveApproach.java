public class LargestElementArrayNaiveApproach {

    // This approach has O(n^2) time complexity
    static int getLargest(int[] arr){
        int n = arr.length;
        int max = arr[0];
        for (int i = 0;i<n;i++){
            for (int j = 0 ; j<n;j++)
                if(arr[j] > max) {
                    max = arr[j];
                    break;
                }
        }
    return max;
    }

    public static void main(String[] args) {
        //some random array
        int[] arr =  {337, 238, 534, 1220, 540, 486, 1045, 1253, 946, 1302};
        System.out.println(getLargest(arr));
    }
}
