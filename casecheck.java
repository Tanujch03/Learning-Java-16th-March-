

import java.util.Scanner;

public class casecheck {
    public casecheck() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char word = input.next().trim().charAt(0);
        System.out.println(word);
        if (word >= 'a' && word <= 'z') {
            System.out.println("lower");
        } else {
            System.out.println("upper");
        }

    }
}
