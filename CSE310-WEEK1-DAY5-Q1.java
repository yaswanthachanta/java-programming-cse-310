/*Consider that there is a cricket player named Smith who hits certain number of 4s and 6s in a cricket match. Find out total numbers of scores he makes with his 
4s & 6s only.*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int f=sc.nextInt();
        int s=sc.nextInt();
        if((f<0)||(s<0))
        {
        System.out.println("0");
        }
        else
        {
            System.out.println((f*4)+(s*6));
        }
        
    }
}
