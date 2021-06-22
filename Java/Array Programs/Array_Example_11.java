//23. Write a Java program to test the equality of two arrays. 
import java.util.*; 
public class Array_Example_11 {
public static void main(String[] args){   
    int i,r1,r2,k=0;
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
    if(a.length!=b.length){
        k=1;
    }
    else{
        for (i = 0; i < a.length; i++)
        {
            if(a[i] != (b[i]))
            {
                k=1;
            }
        }
    }
    if(k==0){
        System.out.println("Both the arrays are same.");
    }
    else{
        System.out.println("Both the arrays are different.");

    }
    }
}
