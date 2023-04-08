public class patterns {
    public static void main(String[] args)
    {
        //pattern1(4);
        //pattern2(4);
        //pattern3(4);
        pattern4(5);

    }

    /*  $
        $ $
        $ $ $
        $ $ $ $ ------>Pattern1*/
    static void pattern1(int n)
    {
        for(int row=1;row<=n;row+=1)
        {
            for(int col=1;col<=row;col+=1)
            {
                System.out.print("$ ");
            }
            //after completing row have to go to newline..
            System.out.println();
        }

    }


    /* $ $ $ $
       $ $ $ $
       $ $ $ $
       $ $ $ $ ----->Pattern 2*/
    static void pattern2(int n)
    {
        for(int row=1;row<=n;row+=1)
        {
            for(int col=1;col<=4;col+=1)
            {
                System.out.print("$ ");
            }
            //after completing row have to go to newline..
            System.out.println();
        }

    }

    static void pattern3(int n)
    {
        for(int row=1;row<=n;row+=1)
        {
            for(int col=1;col<=n-row+1;col+=1)
            {
                System.out.print("$ ");
            }
            //after completing row have to go to newline..
            System.out.println();
        }

    }


    /*  1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5---->pattern 4*/
    static void pattern4(int n)
    {
        for(int row=1;row<=n;row+=1)
        {
            for(int col=1;col<=row;col+=1)
            {
                System.out.print(col+" ");
            }
            //after completing row have to go to newline..
            System.out.println();
        }

    }
}
