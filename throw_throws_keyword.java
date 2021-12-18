
class NegativeRadiousException extends Exception{ // creating custom exception
    public String toString(){
        return "Radious can not be negative";
    }
    public String getMessage(){
        return "Radious can not be negative";
    }
}

public class throw_throws_keyword {

    public static double Getarea(int r) throws NegativeRadiousException{
        if(r<0){
            throw new NegativeRadiousException();
        }
        double area  = 3.14 * r*r;
        return area;
    }
    public static int divide(int a, int b) throws ArithmeticException{
        int result = a/b;
        return result;
    }
    public static void main(String[] args) {

        NegativeRadiousException r1 = new NegativeRadiousException();
        try{
            int c = divide(6, 0);
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println("Exception");
        }
        try{
            double AREA = Getarea(-10);
            System.out.println(AREA);
        }
        catch(Exception e){
            System.out.println(r1.getMessage());
        }
        
    }
}
