public class LargestElementArrayEfficientApproach {
    //This approach finds the largest element in one Traversal ,i.e, O(n) Time Complexity.
    static int getLargest(int[] arr){
        int res = 0;
        for (int i =1;i< arr.length;i++)
            if(arr[i] > arr[res])
                res = i;
        return res;
    }
    public static void main(String[] args) {
        int[] arr= {313, 23, 1468, 1485, 546, 1900, 1436, 1208, 427, 26};
        System.out.println(arr[getLargest(arr)]);
    }
}
