import java.util.Scanner;
public class MultiArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        int array1[][] = new int[r][c];
        int array2[][] = new int[r][c];
        int m;
        if(r==c) {

            System.out.println("Enter Array 1: ");
            for(int i=0;i<r;i++) {
                for (int j=0; j<c; j++) {
                    array1[i][j] = sc.nextInt();
                }
            }
            System.out.println("Enter Array 2: ");
            for(int i=0;i<r;i++) {
                for (int j=0; j<c; j++) {
                    array2[i][j] = sc.nextInt();
                }
            }
            System.out.println("Added array: ");
            for(int i=0;i<r;i++) {
                System.out.println();
                for (int j=0; j<c; j++) {
                    m = (array1[i][j]+array2[i][j]);
                    System.out.print(m + " ");
                }

            }
        }else {
            System.out.println("Number of rows and columns must be same.");
        }
    }
}

