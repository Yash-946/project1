import java.util.Scanner;

public class Ascendingcheck {
    public static void main(String[] args) {
        int h1,h2,h3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digit: ");
        h1 = sc.nextInt();
        h2 = sc.nextInt();
        h3 = sc.nextInt();
        System.out.println((h1<h2)&& (h2<h3));

    }

}
