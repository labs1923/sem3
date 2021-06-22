//1. Write a Java program to sort a numeric array and a string array.
import java.util.*; 
public class Array_Example_1 {
public static void main(String[] args){   
    int i,j,r1,r2;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter number of numerical values:");
    r1 = s.nextInt();
    int a[]=new int[r1];

    System.out.println("Enter numerical values:");
    for(i=0;i<r1;i++){
        a[i] = s.nextInt();
    }
    System.out.println("Enter number of String elements:");
    r2 = s.nextInt();
    String b[]=new String[r2];
    for(j=0;j<r2;j++){  
        System.out.println("Enter string "+j+": ");
        b[j] = s.nextLine();
    }
    System.out.println("Original numeric array : "+Arrays.toString(a));
    Arrays.sort(a);
    System.out.println("Sorted numeric array : "+Arrays.toString(b));
    System.out.println("Original string array : "+Arrays.toString(b));
    Arrays.sort(b);
    System.out.println("Sorted string array : "+Arrays.toString(b));
    }
}