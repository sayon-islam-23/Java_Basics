public class try_catch {
    public static void main(String[] args) {
        int [] arr = {1,2,3};
        try {
            System.out.println(arr[100]);
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e);
        }
        System.out.println("Using try-catch method, you can proceed further in a program in which a acertain error is occured. by using it your program will not stop, insteda of that it will print your error, and continue to the next steps. It is used in URL crawling, it the url actually not exists");
    }
}
