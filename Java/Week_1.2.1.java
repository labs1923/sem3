//Accept two strings from the user and print it on console with concatenation of “and” in middle of the string using scanners.

import java.util.*;      //Scanner class is located in the util package.
class Main{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);     //Creating an object named sc for scanner.
        String str1 = sc.nextLine() , str2 = sc.nextLine();   // Taking two inputs from the scanner.
        System.out.println(str1+" and "+str2);  //Printing the Output.
    }
}
