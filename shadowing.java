public class shadowing {
    static int x = 90;
    public static void main(String[] args)
    {
        x = 40;

        System.out.println(x);
        fun();
    }
    static void fun()
    {
        System.out.println(x);
    }

}
