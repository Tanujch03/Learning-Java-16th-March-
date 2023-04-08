public class recursion1 {
    public static void main(String[] args)
    {
        //program to get in numbers and print it.
        //print first 5 numbers..
        number(1);


    }
    static void number(int n)
    {
        if(n==5)
        {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        number(n+1);
    }



}
