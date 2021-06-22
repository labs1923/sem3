//33. Write a Java program to remove the duplicate elements of a given array and return the new length of the array.Sample array: [20, 20, 30, 40, 50, 50, 50] After removing the duplicate elements the program should return 4 as the new length of the array. 
import java.util.*;
public class Array_Example_15 {    
    public static void main(String[] args) {
        int i,r1;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of numerical values:");
        r1 = s.nextInt();
        int a[]=new int[r1];
        System.out.println("Enter numerical values:");
        for(i=0;i<r1;i++){
            a[i] = s.nextInt();
        }
        System.out.println("Original array length: "+a.length);
        System.out.print("Array elements are: ");
        for (i = 0; i < a.length; i++)
        {
            System.out.print(a[i]+" ");
        }
        Arrays.sort(a); 
        System.out.println("\nThe new length of the array is: "+array_sort(a));
             
     }
     
     public static int array_sort(int[] a) {
          int index = 1;
         for (int i = 1; i < a.length; i++) {
            if (a[i] != a[index-1])
                a[index++] = a[i];
         }
       return index;
     }
 }