
import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 45536;

        int rev = 0;
        int temp = 0;
        while (num > 0) {
            rev = num % 10;//6,3,5,5
            temp = temp*10+rev;
            num = num / 10;//4
        }

        System.out.println(temp);
    }
}
