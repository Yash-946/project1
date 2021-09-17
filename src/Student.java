import java.util.Scanner;

public class Student {
    public String name;
    public  int rollno;
    public void getvalues()
    {
        Scanner sc = new Scanner(System.in);
        name = sc.next();
        rollno = sc.nextInt();
        System.out.println(name+"  "+rollno);
    }
//    public void showvalues()
//    {
//        System.out.println(name+"  "+rollno);
//    }
}

class StudentMain
{
    public static void main(String[] args) {
         Student obj1 = new Student();
         Student obj2 = new Student();

         obj1.getvalues();
//         obj1.showvalues();
         obj2.getvalues();
//         obj2.showvalues();
    }
}
