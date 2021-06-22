//11. Write a Java program to reverse an array of integer values.
import java.util.*; 
public class Array_Example_7 {
public static void main(String[] args){   
    int i,r1;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter number of numerical values:");
    r1 = s.nextInt();
    int a[]=new int[r1];

    System.out.println("Enter numerical values:");
    for(i=0;i<r1;i++){
        a[i] = s.nextInt();
    }
    System.out.println("Original Array is "+Arrays.toString(a));
    for(i = 0; i < r1 / 2; i++)
    {
      int temp = a[i];
      a[i] = a[a.length - i - 1];
      a[a.length - i - 1] = temp;
    }
      System.out.println("Reverse array : "+Arrays.toString(a));
   
    }
}