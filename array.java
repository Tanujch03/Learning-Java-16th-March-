import java.util.Scanner;

public class array {
    public array() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];

        int i;
        for(i = 0; i < arr.length; ++i) {
            arr[i] = in.nextInt();
        }

        for(i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }

    }
}
