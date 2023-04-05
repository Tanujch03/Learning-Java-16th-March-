
// program to find whether the given string is a palindrome or not.
//palindrome - eg: "abcdcba" when this is reversed the answer is same "abcdcba".
public class stringpalindrome {
    public static void main(String[] args)
    {
        System.out.println(ispalindrome("abcdcba"));
    }
    static boolean ispalindrome(String str)
    {
        str = str.toLowerCase();
        for(int i=0;i<str.length()/2;i+=1)
        {
            char start = str.charAt(i);
            char end = str.charAt(str.length()-1-i);
            if (start !=end)
            {
                return false;
            }
        }

        return true;
    }
}
