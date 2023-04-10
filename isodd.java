
//Program whether the given number is odd or not.
public class isodd {
    public static void main(String[] args)
    {
        int n = 90;
        System.out.println(isodd(n));
    }
    private static boolean isodd(int n)
    {
        return (n & 1) == 1;
    }
}
