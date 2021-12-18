import java.util.Scanner;

public class insertion_sort {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int i;
    System.out.println("Enter how many digits you want in the array = ");
    int n = scan.nextInt();
    int [] arr = new int[n];
    System.out.println("Enter the elements in the array ");
    for( i=0;i<n;i++){
        arr[i] = scan.nextInt();
    }
    System.out.println("The input array is ");
    for (  i = 0; i < n; i++) {
        System.out.print(arr[i]+ " ");
    }
    System.out.println("\n");
    int j, temp;
    for(i=1;i<n;i++){
        temp = arr[i];
        j= i-1;
        while((temp<arr[j]) && (j>=0)){
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = temp;
    }
    scan.close();
    System.out.println("The sorted array is ");
    for (i = 0; i < n; i++) {
        System.out.print(arr[i]+ " ");
    }
}   
}