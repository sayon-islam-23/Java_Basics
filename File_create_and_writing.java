import java.io.FileWriter;
public class File_create_and_writing {
    public static void main(String[] args) {
        try{
            FileWriter filewrite = new FileWriter("abcd.txt");
            filewrite.write("Let's write something inside the file\n now close the file");
            filewrite.close();
        }
        catch(Exception e){
            System.out.println(e);
            System.out.println("file not found");
        }
    }
}
