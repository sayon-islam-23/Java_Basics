
class Box{
    int x;
    int y;
    int h;

    Box(int x, int y, int h){
        this.x = x;
        this.y = y;
        this.h = h;
    }

    Box(){
        this.x=0;
        this.y=0;
        this.h=0;
    }
    Box(int x){
        this.x = x;
        this.y = x;
        this.h = x;
    }
    int volumn(){
        return (x*y*h);
    }

}


public class constructor_overloading {

    public static void main(String[] args) {
        Box b1 = new Box(10,20,30);
        System.out.println(b1.volumn());
        Box b2 = new Box();
        System.out.println(b2.volumn());
        Box b3 = new Box(10);
        System.out.println(b3.volumn());
    }
}