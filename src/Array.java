import java.util.Scanner;
public class Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of students: ");
        int n = sc.nextInt();
        double marks[] = new double[n];
        for(int i=0;i<n;i++) {
            System.out.print("Enter Marks in Subject " + (i+1) + ": ");
            marks[i] = sc.nextDouble();
        }

        int s = 0;
        for(int i=0; i<n ; i++) {
            s+=marks[i];
        }
        System.out.println("Average: " + (s/n));

        sc.close();
    }

}
