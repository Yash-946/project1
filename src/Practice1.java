public class Practice1 {
    int num1 = 89;

    public void method1() {
        int num1 = 65;
//        num1 = 1;
//        num1 = 2;
        System.out.println(this.num1);
//        System.out.println(num1);
    }
}

class Practice1main
{
    public static void main(String[] args) {
        Practice1 obj = new Practice1();
        obj.method1();
    }
}