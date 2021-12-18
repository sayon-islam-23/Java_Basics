class MyEmployee{
    private int id;
    private String name;
    
    public void setName(String n){
        this.name = n;
    }
    public String getName(){
        return name;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
}

public class getters_setters_access_modifiers_and_constructors {
    public static void main(String[] args) {
        MyEmployee emp = new MyEmployee();
        //emp.id = 101;
        //emp.name = "abcd";
        emp.setName("abcd");
        emp.setId(101);
        System.out.println(emp.getName());
        System.out.println(emp.getId());
    }
}
