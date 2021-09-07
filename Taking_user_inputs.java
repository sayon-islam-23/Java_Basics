import java.util.Scanner;

import java.util.Scanner;
public class Taking_user_inputs {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Your Name = ");
        String input_1 = scan.nextLine();
        System.out.print("Your Name is ");
        System.out.println(input_1);
        System.out.print("Enter Your age = ");
        int input_2 = scan.nextInt();
        System.out.print("Your age is ");
        System.out.println(input_2);
    }
}
