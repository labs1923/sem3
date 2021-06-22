//2. Write a Java program to sum values of an array.
import java.util.*; 
public class Array_Example_2 {
public static void main(String[] args){   
    int i,sum=0,r1;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter number of numerical values:");
    r1 = s.nextInt();
    int a[]=new int[r1];
    System.out.println("Enter numerical values:");
    for(i=0;i<r1;i++){
        a[i] = s.nextInt();
    }
    
    System.out.println("Original numeric array : "+Arrays.toString(a));
    for(i=0;i<r1;i++){
        sum+=a[i];
    }
    System.out.println("The sum is " + sum);

    }
}