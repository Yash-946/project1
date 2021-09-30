import java.util.Scanner;

public class Yash {
    public static void main(String[] args) {
        double minutesInayear = 60*24*365;
        Scanner input = new Scanner(System.in);
        System.out.println("print number of minutes:");
        double min= input.nextDouble();
        long years= (long)(min/minutesInayear);
        int days= (int) (min/60/24)%365;
        System.out.println((int) min + "minutes in a year" + years +  " years and "  + days + " days");
    }
}
