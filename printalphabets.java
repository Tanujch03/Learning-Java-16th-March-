
//Program to print the alphabets..
public class printalphabets {
    public static void main(String[] args)
    {
        String a = "";
        for(int i=0;i<26;i++)
        {
            char b =(char)('a'+i);
            a = a + b;

        }
        System.out.print(a+" ");
    }
}
