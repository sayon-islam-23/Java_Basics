public class InnerClass {
    public static void main(String[] args) {
        //access it in main
        Name finalName = new Name();
        finalName.data();
    }
}

class Name{
    private class Sayan{
        void name(String m){
            System.out.println("My Name is "+m);
        }
    }

    //accessing inner class element outside of this class
    void data(){
        Sayan n = new Sayan();
        n.name("Sayan");
    }
}
