abstract class vehicle{
    int no_of_tyre;
    abstract void start();
}
class car extends vehicle {
    int no_of_tyre = 4;
    void start(){
        System.out.println("starts with key" + " having tyres " + no_of_tyre);
    } 
}
class scooter extends vehicle {
    int no_of_tyre = 2;
    void start(){
        System.out.println("starts with kick" + " having tyres " + no_of_tyre);
    } 
}
public class Abstraction{
    public static void main(String[] args) {
        car c1 = new car();
        scooter s1 = new scooter();
        c1.start();
        s1.start();
    }
}