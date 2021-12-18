/* import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

class ReadAndWrite{
    void ReadFile() throws FileNotFoundException{
        FileInputStream fis = new FileInputStream("d:/abc.txt");
        // statement
    }
    void saveFile() throws FileNotFoundException{
        String text = "this is a demo";
        FileOutputStream fas = new FileOutputStream("d:/xyz.txt");
        // statement
    }
}
public class Throws{
    public static void main(String[] args) {
        ReadAndWrite rw = new ReadAndWrite();
        try{
            rw.ReadFile();
            rw.saveFile();
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("program ends");
        }
        
    }
} */