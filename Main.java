//Q 1.1
class Person {
    int age;
    String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Person() {
        this.name="Unknown";
        this.age = 18;
    }

    public void display() {
        System.out.println("Name: " + name + " " + "Age: " + age);
    }

}
    public class Main{
        public static void main(String[] args){
            Person p1= new Person(21,"Akhilesh");
            Person p2= new Person();
            p1.display();
            p2.display();
        }
    }
