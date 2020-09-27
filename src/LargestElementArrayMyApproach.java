import java.util.Scanner;

public class LargestElementArrayMyApproach {
    public static int maxEle(int[] arr , int n){
        int max = arr[0];
        for(int i = 0 ; i<n-1;i++)
            if (arr[i] < arr[i + 1])
                max = arr[i + 1];
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of the array: ");
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        System.out.println("Largest Element: " + maxEle(arr,n));
    }
}
