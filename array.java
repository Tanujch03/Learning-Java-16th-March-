
import java.util.Scanner;
public class array {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = in.nextInt(); //getting the values from the user.
        }
        //arr = [1,2,3,4,5];
        //System.out.println(arr[0]);

        for(int i=0;i<arr.length;i++)
        {
            //arr[i] = in.nextInt();
            System.out.print(arr[i]+" "); // printing the values.
        }
    }

}
