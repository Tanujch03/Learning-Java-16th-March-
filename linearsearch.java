
import java.util.Scanner;
public class linearsearch {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.print("Enter the value to be checked: ");
        int a = in.nextInt(); //Getting the value from the user to
                                         // check whether it contains in the array or not.
        System.out.print("Enter the array values: ");
        for(int i = 0;i<arr.length;i+=1) //Getting the array values from the user.
        {
            arr[i] = in.nextInt();
        }

        for(int i = 0;i<arr.length;i+=1)
        {
            //System.out.print(arr[i]);
            if(arr[i]==a)
            {
                System.out.println(arr[i]+" contains in array");
            }

        }

    }
}
