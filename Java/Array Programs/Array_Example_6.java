//12. Write a Java program to find the duplicate values of an array of integer values.
import java.util.*; 
public class Array_Example_6 {
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
    for (i = 0; i < r1; i++)
        {
            for (int j = i+1; j < r1; j++)
            {
                if ((a[i] == a[j])&&(i!=j))
                {
                    System.out.println("Duplicate Element : "+a[j]);
                }
            }
        }
    
    }
}