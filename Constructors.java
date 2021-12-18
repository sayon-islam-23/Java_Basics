class MyMainEmployee{
    private int id;
    private String name;
    
    /* public void setName(String n){
        this.name = n;
    } */
    public String getName(){
        return name;
    }
    /* public void setId(int i){
        this.id = i;
    } */
    public int getId(){
        return id;
    }
    public MyMainEmployee(){
        this.id = 1121;
        this.name = "hdkjgvnfghdfkjgdfkh";
    }
    public MyMainEmployee(String MyName, int MyId){
        this.id = MyId;
        this.name = MyName;    
    }
    public int setAdd(int a,int b){
        return(a+b);
    }
}
public class Constructors {
    public static void main(String[] args) {
        MyMainEmployee emp = new MyMainEmployee("sayon islam", 101);
        MyMainEmployee emp1 = new MyMainEmployee();
        //emp.setName("abcd");
        //emp.setId(101);
        System.out.println("the name is " +emp1.getName());
        System.out.println("the id is " +emp1.getId());
        System.out.println("the name is " +emp.getName());
        System.out.println("the id is " +emp.getId());
        System.out.println(emp.setAdd(10,20));;
    }
}
