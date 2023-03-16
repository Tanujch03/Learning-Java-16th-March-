import java.util.Scanner;

public class reverse {

    public static void main(String[] args) {
        new Scanner(System.in);
        int num = 45536;
        int rev = false;

        int temp;
        for(temp = 0; num > 0; num /= 10) {
            int rev = num % 10;
            temp = temp * 10 + rev;
        }

        System.out.println(temp);
    }
}
