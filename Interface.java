interface I1{
    public void display();
    int sec = 10;
    default void name(){
        System.out.println("my name is sayon islam");
    }
    default void college(){
        System.out.println("college name is BPPIMT");
    }
}

class chatro implements I1{
    public void display(){
        System.out.println("we want offline class but online exam ");
        System.out.println(sec + " bahane karke le gaya dil");
    }
}
public class Interface {
    public static void main(String [] args){
        chatro c1 = new chatro();
        c1.display();
        c1.name();
        c1.college();
    }
}
