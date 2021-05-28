//Write a program that accepts the set of inputs from the user of various integer data types
//and determines the primitive data type that is capable of properly storing that input.

import java.util.*;
import java.io.*;

public class Week2_a{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            try{long x = sc.nextLong();
            if(x >= -128 && x<= 127)
                System.out.println("*byte");
            if(x >= Short.MIN_VALUE && x <= Short.MAX_VALUE)
                System.out.println("*short");
            if(x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE)
                System.out.println("*int");
            if(x >= Long.MIN_VALUE && x <= Long.MAX_VALUE)
                System.out.println("*long");
        }catch(Exception e){
            System.out.println("Cant be fitted any where");
            sc.next();
        }
        }
    }
}
