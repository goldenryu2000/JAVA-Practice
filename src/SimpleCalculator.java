import java.util.Scanner;
public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two Numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print(" Enter Choice:\n 1.Sum \n 2.Difference \n 3.Product \n 4.Quotient \n 5.Remainder \n\n Enter Choice: ");

        int choice = sc.nextInt();

//		Implementing calculator using Switch Case

        switch(choice) {
            case 1:
                System.out.println("Sum:" + (a+b));
                break;
            case 2:
                System.out.println("Difference: "+(a-b));
                break;
            case 3:
                System.out.println("Product: "+(a*b));
                break;
            case 4:
                System.out.println("Quotient: "+(a/b));
                break;
            case 5:
                System.out.println("Remainder: "+(a%b));
                break;
            default:
                System.out.println("Enter a valid Choice");
        }

        sc.close();

    }

}
