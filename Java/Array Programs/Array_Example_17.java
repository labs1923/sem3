//52. Write a Java program to separate even and odd numbers of a given array of integers. Put all even numbers first, and then odd numbers.
import java.util.*;
public class Array_Example_17
{
	
	 public static void main (String[] args)
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
        System.out.println("Original Array ");
        System.out.println(Arrays.toString(a));

        int begin = 0, end = a.length - 1;
        while (begin < end)
        {
            while (a[begin]%2 == 0 && begin < end)
                begin++;
 
            while (a[end]%2 == 1 && begin < end)
                end--;
 
            if (begin < end)
            {
                int temp = a[begin];
                a[begin] = a[end];
                a[end] = temp;
                begin++;
                end--;
            }
        }
 
        System.out.print("Array after separation ");
        System.out.println(Arrays.toString(a));
    }
	
}