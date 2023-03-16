
import java.util.Scanner;
public class largestthree1 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int m;

        m = a;
        if(b>m)
        {
            m = b;

        }
        if(c>m)
        {
            m = c;
        }
        System.out.println(m);
    }

}
