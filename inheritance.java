class Base{
    int x;
    public void printme(){
        System.out.println("i am a method");
    }
    public void setx(int x){
        this.x = x;
    }
    public int getx(){
        return x;
    }
    Base(){
        System.out.println("I am a Constructor");
    }
    Base(int x){
        System.out.println("i am an overloaded constructor with a value " +x);
    }

} 

class Derived extends Base{
    int y;
    public void sety(int y){
        this.y = y;
    }
    public int gety(){
        return y;
    }
    Derived(){
        //super(100); // to use the 2nd constructor of the Base class, from where Derived class inheritates.
        System.out.println("i am a derived class constructor");
    } 
    Derived(int a, int b){
        super(a);
        System.out.println("i am an overloaded constructor with values " + b);
    }
}

public class inheritance {
    public static void main(String[] args) {
        //Base b = new Base();
        /* b.setx(4);
        System.out.println(b.getx());
        b.printme();
        System.out.println("\n"); */
        Derived b1 = new Derived(14,9);
        b1.sety(16);
        System.out.println(b1.gety());
        b1.printme();
    }
}
