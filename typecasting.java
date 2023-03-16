import java.util.Scanner;
public class typecasting {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        float num1 = input.nextFloat();
        System.out.println(num1);


        float num2 = (float) (23);
        System.out.println(num2);

        int a = 255;
        byte b = (byte) (a);
        System.out.println(b);


    }
}
