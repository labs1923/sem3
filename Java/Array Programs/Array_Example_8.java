//15. Write a Java program to find the common elements between two arrays of integers. 
import java.util.*; 
public class Array_Example_8 {
public static void main(String[] args){   
    int i,j,r1,r2,k=0;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter number of numerical values in first array:");
    r1 = s.nextInt();
    int a[]=new int[r1];

    System.out.println("Enter numerical values:");
    for(i=0;i<r1;i++){
        a[i] = s.nextInt();
    }
    System.out.println("Enter number of numerical values in second array:");
    r2 = s.nextInt();
    int b[]=new int[r2];
    System.out.println("Enter numerical values:");
    for(i=0;i<r2;i++){
        b[i] = s.nextInt();
    }
    System.out.println("Original numeric array1 is : "+Arrays.toString(a));
    System.out.println("Original numeric array2 is : "+Arrays.toString(b));
    for (i = 0; i < a.length; i++)
    {
        for (j = 0; j < b.length; j++)
        {
            if(a[i] == (b[j]))
            {
                k=1;
                System.out.println("Common element is : "+(a[i]));
            }
        }
    }
    if(k==0){
        System.out.println("No common elements are found.");
    }
    }
}