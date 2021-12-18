class Wrapper_class{
    public static void main (String[] args) {
        
        //AUTOBOXING
        
        int a = 10;
        Integer i = a;
        System.out.println("the value of the wrapper class object = " + i); 
        
        //UNBOXING
        
        Integer j = new Integer(20);
        int k = j;
        System.out.println("the value of the primitive data = " + k);  
    }
}

