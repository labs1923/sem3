//22. Write a Java program to find all pairs of elements in an array whose sum is equal to a specified number.
import java.util.*; 
public class Array_Example_10 {
public static void main(String[] args){   
    int i,r1,key;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter number of elements in array:");
    r1 = s.nextInt();
    int a[]=new int[r1];

    System.out.println("Enter elements of array:");
    for(i=0;i<r1;i++){
        a[i] = s.nextInt();
    }
    System.out.println("Enter required sum:");
    key = s.nextInt();
    System.out.println("Array elements are : "+Arrays.toString(a));
    System.out.println("Required elements and their sum : ");
 
    for (i =  0; i < a.length; i++)
    {
        for (int j  = i+1; j < a.length; j++)
        {
            if(a[i]+a[j] == key)
            {
                System.out.println(a[i]+" + "+a[j]+" =  "+key);
            }
        }
    }

    }
}