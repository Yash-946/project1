import java.util.Scanner;

public class Employee
{
    int EId;
    String Ename;
    int Esalary;
    static String Cname;

   public Employee(int a, String name, int s)
    {
        EId = a;
        Ename = name;
        Esalary = s;
    }
    public static void result(Employee tarr[])
    {
        int Max = Integer.MIN_VALUE;
        int Aindex = 0;
        for (int i = 0; i < tarr.length; i++)
        {
            if (tarr[i].Esalary>Max)
            {
            Max = tarr[i].Esalary;
            Aindex = i;
            }
        }
        System.out.println("sal = "+ tarr[Aindex].Esalary+ "\nThe employee name = "+ tarr[Aindex].Ename);
    }
}

class Employeetest
{
    public static void main(String[] args)
    {
        Scanner S = new Scanner(System.in);
        Employee arr[] = new Employee[2];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = new Employee(S.nextInt(), S.next(), S.nextInt());
        }
        Employee.result(arr);
    }
}
