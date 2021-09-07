import java.util.Scanner;

public class switch_statements {
    public static void main(String[] args) {
        java.util.Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Age");
        int age  = scan.nextInt();
        switch (age) {
            case 10:
                System.out.println("Your age is 10");
                break;
            case 20:
                System.out.println("Your age is 20");
                break;
            case 30:
                System.out.println("Your age is 30");
                break;
            case 40:
                System.out.println("Your age is 40");
                break;
            default:
                System.out.println("Your age does not match any");
                break;
        }
    }
}
