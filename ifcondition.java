import java.util.Scanner;


public class ifcondition {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of num: ");
        int num = input.nextInt();

        if (num>10000)
        {
            num+= 2000;
            System.out.println("Adding 2000 to sum: "+num);
        }
        else
        {
            num+= 1000;
            System.out.println("Adding 2000 to sum: "+num);
        }
    }


}
