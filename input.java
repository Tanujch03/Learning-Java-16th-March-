//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class input {
    public input() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your rollno:  ");
        int rollno = input.nextInt();
        System.out.println("Your roll number: " + rollno);
        String name = input.next();
        System.out.println("Your name: " + name);
        float marks = input.nextFloat();
        System.out.println("Your marks: " + marks);
    }
}
