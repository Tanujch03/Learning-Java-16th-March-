public class recursive_factorial {
    public static void main(String[] args)
    {
        System.out.println(fact(5)); // need to print when the function is integer type.
                                        // void don't need to print, directly we can call the function

    }
    static int fact(int n)  // function named fact, argument n.
    {
        if(n<=1)
        {
            return 1;
        }
        return n*fact(n-1);
    }
}
