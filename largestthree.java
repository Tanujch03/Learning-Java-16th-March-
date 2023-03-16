//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class largestthree {
    public largestthree() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if (a > b) {
            if (a > c) {
                System.out.println("a larger: " + a);
            } else {
                System.out.println("c larger: " + c);
            }
        } else if (b > a) {
            if (b > c) {
                System.out.println("b larger: " + b);
            } else {
                System.out.println("c larger: " + c);
            }
        }

    }
}
