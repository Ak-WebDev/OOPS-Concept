//Q 1.4

class PersonBase {

    String name;
    int age;

    public PersonBase(String name, int age){
        this.name=name;
        this.age=age;
    }
}

class Employee extends PersonBase{
    int employeeId;
    double salary;

    public Employee(String name, int age, int employeeId, double salary){
        super(name,age);
        this.employeeId=employeeId;
        this.salary=salary;
    }
    public String toString() {
        return "Employee{name='" + name + "', age=" + age +
                ", employeeID='" + employeeId + "', salary=" + salary + "}";
    }
}

public class BasePerson {
    public static void main(String[] args){
        Employee employee= new Employee("Akhilesh",21,153,1327);
        System.out.println(employee);
    }
}
