import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter First Number = ");
    float num_1 = scan.nextFloat();
    System.out.println("Enter Second Number = ");
    float num_2 = scan.nextFloat();
    System.out.println("You have entered " + num_1 +" " + num_2);   
    System.out.println("Press 0 for addition, 1 for substraction, 2 for multiplication, 3 for division");   
    int val = scan.nextInt();
    switch(val){
        case 0:
            System.out.print("The addition is = ");
            System.out.println(num_1 + num_2);
            break;
        case 1:
            System.out.print("The substraction is = ");
            System.out.println(num_1 - num_2);
            break;
        case 2:
            System.out.print("The multiplication is = ");
            System.out.println(num_1 * num_2);
            break;
        case 3:
            System.out.print("The division is = ");
            System.out.println(num_1 / num_2);
            break;
        default:
            System.out.println("Invalid Syntax");
    }
    }
}
