import java.util.Scanner;
public class conditional_statements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age = ");
        int age = scan.nextInt();
        if(age<10){
            System.out.println("you are a kid");
        }
        else if(age>=10 && age<=18){
            System.out.println("You are a teenager");
        }
        else{
            System.out.println("You are an adult");
        }
    }
}