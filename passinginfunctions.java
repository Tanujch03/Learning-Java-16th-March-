
import java.util.Arrays;
import java.util.Scanner;
public class passinginfunctions {
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));


    }
    static void change(int[] nums)
    {
        Scanner in = new Scanner(System.in);
        nums[0] = in.nextInt();

    }
}
