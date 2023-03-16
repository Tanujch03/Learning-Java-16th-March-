
import java.util.Scanner;

public class whileloop {
    public static void main(String[] args)
    {
        Scanner input =new Scanner(System.in);
        // print the number from 1 to 10
        System.out.println("Printing the while loop");
        int num = input.nextInt();
        while(num>0)
        {

            System.out.println(num);
            num--;

        }
    }
}
