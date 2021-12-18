import java.util.Scanner;
public class linear_search{
    public static void main(String [] args){
        int [] arr = {10,20,30,40,50,60};
        int flag = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number you want to search = ");
        int n = scan.nextInt();
        scan.close();
        for (int i= 0; i<arr.length;i++){
            if(n==arr[i]){
                int pos= i+1;
                System.out.println( n +" has been found at the place " + pos);
                flag=1;
                break;
            }
        }
            if(flag==0){
                System.out.println(n + " do not found");
            }
    }
}