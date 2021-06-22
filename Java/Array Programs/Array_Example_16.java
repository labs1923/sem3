//39. Write a Java program to print all the LEADERS in the array. Note: An element is leader if it is greater than all the elements to its right side.
import java.util.*;

public class Array_Example_16
{
 public static void main(String[] args)
    {
        int i,r1;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of numerical values:");
        r1 = s.nextInt();
        int a[]=new int[r1];
        System.out.println("Enter numerical values:");
        for(i=0;i<r1;i++){
            a[i] = s.nextInt();
        }
        for ( i = 0; i < r1; i++) 
        {
            int j;
            for (j = i + 1; j < r1; j++) 
            {
                if (a[i] <= a[j])
                    break;
            }
            if (j == r1) 
                System.out.print(a[i] + " ");
        }
    }
}