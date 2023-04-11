// program to find sum of digits n = 1345 using recursion.
// 1+3+4+5 = 13.
public class recuesive_sumdigits {
    public static void main(String[] args)
    {
        System.out.println(sumdigits(1345));
    }

    static int sumdigits(int n)
    {
        if(n==0)
        {
            return 0;
        }
        return (n%10) +sumdigits(n/10);
    }
}
