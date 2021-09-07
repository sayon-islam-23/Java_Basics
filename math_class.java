public class math_class {
    public static void main(String[] args) {
        int a = 22, b = 23;
        System.out.println(Math.max(a, b)); 
        System.out.println(Math.min(a, b)); 
        System.out.println(Math.sqrt(36)); //it makes the square root
        System.out.println(Math.abs(10));   // it makes the absolute value
        System.out.println(Math.abs(-10));  // the absolute value of -ve number is positive
        System.out.println(Math.random());  // it generates a random number between 0 to 1
        System.out.println(4+(8-4)*Math.random()); // it generates a random number between 4 and 8
        System.out.println(10+(20-10)*Math.random()); // it generates a random number between 10 and 20
        System.out.println(100+(200-100)*Math.random()); // it generates a random number between 100 and 200
        System.out.println(1000+(2000-1000)*Math.random()); // it generates a random number between 1000 and 2000
    }
}
