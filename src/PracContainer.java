public class PracContainer {
    public static void main(String[] args) {
        Laptop obj = new Laptop();
        obj.p1.price= 15000;
        obj.p1.name = "Intel";
        obj.p1.ram = 8;

        obj.display();
    }
}
    class Processor
    {
        int price;
        String name;
        int ram;
    }

   class Laptop
   {
        int weight;
        String name;
        Processor p1;
        Laptop()
        {
            weight = 2;
            name = "Dell";
            p1 = new Processor();
        }
        public void display()
        {
            System.out.println("Laptop:-");
            System.out.println(weight);
            System.out.println(name);
            System.out.println("Processor:-");
            System.out.println(p1.price);
            System.out.println(p1.name);
            System.out.println(p1.ram);
        }

    }


