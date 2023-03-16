
import java.util.Scanner;
public class finbinacci {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        while(count<=num)
        {
            int temp = b; //1
            b = b+a;     //0+1=1,b=2,
            a = temp;   //a=1,=1,
            count++;   //3,4
        }
        System.out.println(b);



    }
}
