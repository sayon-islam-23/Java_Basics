import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class File_reading {
    public static void main(String[] args) {
        File myFile = new File("abcd.txt");
        try{
            Scanner scan = new Scanner(myFile);
            while(scan.hasNextLine()){
                String line = scan.nextLine();
                System.out.println(line);
            }
            scan.close();
        }
        catch(FileNotFoundException e){
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
