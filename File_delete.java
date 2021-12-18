import java.io.File;
public class File_delete {
    public static void main(String[] args) {
        File myFile = new File("abc.txt");
        try{
            if(myFile.delete()){
                System.out.println("File has been delted = " + myFile.getName());
            }
        }
            catch(Exception e){
                System.out.println("File has not delete");
                e.printStackTrace();
            }
    }
}
