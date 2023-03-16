import java.util.Scanner;

public class dowhile {
    public dowhile() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Printing the do while loop");
        int num = input.nextInt();

        do {
            System.out.println("Prints this message first without going into while loop " + num);
            --num;
        } while(num > 0);

    }
}
