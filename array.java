import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        int [] marks = {1,2,3,4,5};  //declaration of an array
        marks[4] = 6;                   // updating array element
        System.out.println(marks[4]);

        //printing entire array using FOR loop
        System.out.println("Using For Loop");
        for(int i = 0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
        // printing entire array using FOR EACH loop
        System.out.println("Using For Each Loop");
        for(int value:marks){
            System.out.println(value);
        }
        // 2D array 
        System.out.println("2D array");
        int [][] numbers = {{1,2,3},{4,5,6}};
        System.out.println(numbers[0][2]);   
        
        // String array 
        System.out.println("String array");
        String [] cars = {"BMW", "Merc", "Maruti"};
        for(String value:cars){
            System.out.println(value);
        }
        
    }
}
