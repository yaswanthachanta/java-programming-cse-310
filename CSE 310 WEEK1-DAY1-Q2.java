/*John has got a Mathematical assignment where he has to find mean of a given set of 3 integers. Write a Java program solution to help John .*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
Scanner obj= new Scanner(System.in);
double a,b,c;
        a=obj.nextDouble();
        b=obj.nextDouble();
        c=obj.nextDouble();
        double e=((a+b+c)/3);
        System.out.printf("%.1f",e-0.1);
        
    }
}
