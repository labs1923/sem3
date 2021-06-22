//3. Write a Java program to print the following grid.
import java.util.Scanner;
public class Array_Example_3 {
    public static void main(String[] args) {  
        int r1,c1;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of rows :");
        r1 = s.nextInt();
        System.out.println("Enter number of columns :");
        c1 = s.nextInt();
        int [][]a = new int[r1][c1];    
         for(int i = 0; i < r1; i++)
           {
              for(int j = 0; j < c1; j++)
              {
                 System.out.printf(" %d ",a[i][j]);
              }
              System.out.println();
           }
        }
        
}
