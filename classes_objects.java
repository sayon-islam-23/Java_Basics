class Employees{
    int id ;
    int salary ;
    String name;
    public void Details(){
        System.out.println("employee id is  = " + id);
        System.out.println("employee name is = " + name);
        System.out.println("employee salary is = " + salary);
    }
} 
public class classes_objects {
    public static void main(String[] args) {
        Employees emp = new Employees();
        emp.id = 23;
        emp.salary = 100000;
        emp.name = "abcd";
        emp.Details();
        Employees emp1 = new Employees();
        emp1.id = 22;
        emp1.salary = 150000;
        emp1.name = "wxyz";
        emp1.Details();
    }
}
