public class loops {
    public static void main(String[] args) {
        // WHILE LOOP
        int i = 0;
        while(i<10){             // in while loop we give a condition, the loop will run untill the condition is not fall
            System.out.println(i);
            i = i+1;
        }


        //DO WHILE LOOP
        int j = 0;
        do{
            System.out.println(j); // in do while the output must print once, while the condition satisfies or not.
            j = j+1;
        }while(j<10);

        
        // FOR LOOP
        int k ;
        for(k=0;k<10;k++){
            System.out.println("This will print the output "+ k);
        }
    }
}
