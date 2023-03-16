import java.util.Scanner;

public class finbinacci {
    public finbinacci() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int a = 0;
        int b = 1;

        for(int count = 2; count <= num; ++count) {
            int temp = b;
            b += a;
            a = temp;
        }

        System.out.println(b);
    }
}