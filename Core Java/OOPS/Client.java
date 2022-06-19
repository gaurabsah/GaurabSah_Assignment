abstract class Employee{
abstract public void salary();
}
class Manager extends Employee{
    int sal,incentive;
    public manager(int sal,int incentive){
        this.sal=sal;
        this.incentive=incentive;
    }
    public void salary(){
        System.out.println("Manager Salary:"+(sal+incentive));
    }
    public int get(){
        return sal+incentive;
    }
}
class Labour extends Employee{
    int overtime;
    int labour_salary;

    public Labour(int labour_salary,int overtime){
        this.labour_salary=labour_salary;
        this.overtime=overtime;
    }
    public void salary(){
        System.out.println("Labour Salary:"+(labour_salary+overtime));
    }
    public int get(){
        return labour_salary+overtime;
    }
}
public class Client {
    public static void main(String[] args) {
        manager m=new manager(500,100);
        labour l=new labour(150,40);
        m.salary();
        l.salary();
        int totalSalary=m.get()+l.get();
        System.out.println("Total Salary of all employees: "+totalSalary);
    }
}
