
import java.util.Scanner;
public class sumfunction {
    public static void main(String[] args)
    {
        int a,b,c,d;

        a = sum();
        System.out.println(a);

        b = sum();
        System.out.println(b);

        c = sum2(4,5);
        System.out.println(c);


        //d = swap(5,6);
        //System.out.println(d);



    }

    static int sum2(int a,int b)
    {
        int add = a + b;
        return add;


    }

    static void swap(int a ,int b)
    {
        int temp = a;
        b = a;
        a = temp;

    }


    static int sum()
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();
        int sum1 = num1+num2;
        return sum1;



    }

}
