public class PracArray
{
    final double pi;
    public PracArray()
    {
        pi = 3.14;
    }
    public PracArray(double pi)
   {
        this.pi = pi;
   }

    public static void main(String[] args) {
        PracArray obj = new PracArray(22/7);
        System.out.println(obj.pi);
    }

}
