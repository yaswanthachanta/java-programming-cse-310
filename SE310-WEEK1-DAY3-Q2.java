/*During the code-based test of Java, Peter has been assigned a task to implement a class which reads the Account Number(Long), Account Holder Name(String), Gender (M/F) (Character) and Amount (Integer) to be withdrawn at runtime.

Given that the Current Account Balance is 20000, it is expected to perform the withdrawl if amount to be withdrawn is less than or equal to 20000 and message to be displayed is:

Hi Mr./Ms. XXX! Your Account Balance after withdrawl is YYYYY.

If the amount to be withdrawn is greater than the Current Account Balance, then the message displayed is:

Hi Mr./Ms. XXX! Insufficient Funds! You can not withdraw AAAAA.*/

import java.io.*;

import java.util.*;

import java.text.*;

import java.math.*;

import java.util.*;

public  class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        long n=sc.nextLong();

        sc.nextLine();

        String name=sc.nextLine();

        //sc.nextLine();

        char gender=sc.next().charAt(0);

        sc.nextLine();

        int b=sc.nextInt();

        if(b>=20000)

        {

            if(gender=='F')

            {

                System.out.println("Hi Ms. "+name+"!");

                System.out.println("Insufficient Funds! You can not withdraw "+b+".");

            }

            else

            {

                System.out.println("Hi Mr. "+name+"!");

                System.out.println("Insufficient Funds! You can not withdraw "+b+".");

            }

        }

        else

        {

            if(gender=='F')

            {

                System.out.println("Hi Ms. "+name+"!");

                System.out.println("Your Account Balance after withdrawl is "+(20000-b)+".");

            }

            else

            {

                System.out.println("Hi Mr. "+name+"!");

                System.out.println("Your Account Balance after withdrawl is "+(20000-b)+".");

            }

        }

    }

}
