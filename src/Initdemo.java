import java.util.Scanner;
// definition class

class Student12
{
    int rollno;
    String name ;
    // constructor overloading

    Student12() // non parameterised constructor
    {
        rollno = 89;
        name = "abc";
    }
    Student12(int v1, String v2) // parameterised constructor
    {
        rollno = v1;
        name = v2;
    }
    public void show()
    {
        System.out.println(rollno + "\t"+ name);
    }

}// end of the class

// xecution class
class Student12Main
{
    public static void main(String[] args) {
        // when we create object of the class constructor execute

        // non parametrised constructor invocation to initialize the object
        Student12 obj1 = new Student12();

        //parametrised constructor invocation to initialize the object
        Student12 obj2 = new Student12(134,"aaa");

        obj1.show(); // to print obj1 attributes value
        obj2.show(); // to print obj2 attributes value

    }
}



