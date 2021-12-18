import java.io.File;
public class File_create{
    public static void main(String [] args){

        //how to create a new file

        File myFile = new File("abc.txt");  
        try{
            myFile.createNewFile();
        }
        catch(Exception e){
            System.out.println(e);
        }

        // how to write in a new file

        
    }
}