public class Person {
    public int age; // attributes
    public char gender;
    public void display() // method
    {
        System.out.println(age);
        System.out.println(gender);
    }
} // end
class PersonMain
{
    public static void main(String[] args) {
        Person neeraj = new Person();// object creation
        neeraj.age= 30;
        neeraj.gender='M';
        neeraj.display();

    }
}


