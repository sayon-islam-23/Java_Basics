class C{
    public int med1(){
        return 4;
    }
    public void med2(){
        System.out.println("i am second method of the class C");
    }
}

class B extends C{

    @Override
    public void med2(){
        System.out.println("i am second method of the class B");
    }
    public void med3(){
        System.out.println("i am method of the class B which inherites class C");
    }
}
public class method_overriding {

    public static void main(String[] args) {
        C a = new C();
        a.med2();
        B b = new B();
        b.med2();
    }
}