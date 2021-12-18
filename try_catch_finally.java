class try_catch_finally{
    public static void main(String[] args) {
        try{
            // risky code here
            int a = 100, b = 0, c;
            c = a/b;
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("Program ends");
        }
    }
} 
