import java.util.Scanner; // importing the scanner class
public class input {  // [public - everyone can access ]
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); //[input is an object name.]
        // [.in is where we enter from the keyboard]
        System.out.print("Enter your rollno:  ");
        int rollno = input.nextInt();       // input the integer.
        System.out.println("Your roll number: "+rollno);

        String name = input.next();         // input the string.
        System.out.println("Your name: "+name);

        float marks = input.nextFloat();
        System.out.println("Your marks: "+marks);
    }

}