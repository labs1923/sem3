//19. Write a Java program to add two matrices of the same size.
import java.util.Scanner;
public class Array_Example_9 {
 public static void main(String args[])
   {
      int r1,i,j,c1;
      Scanner s = new Scanner(System.in);
 
      System.out.println("Enter number of rows of matrix");
      r1 = s.nextInt();
      System.out.println("Enter number of columns of matrix");
      c1  = s.nextInt();
 
      int a1[][] = new int[r1][c1];
      int a2[][] = new int[r1][c1];
      int sum[][] = new int[r1][c1];
 
      System.out.println("Input elements of first matrix");
 
      for ( i = 0 ; i < r1 ; i++ )
         for ( j = 0 ; j < c1 ; j++ )
            a1[i][j] = s.nextInt();
 
      System.out.println("Input the elements of second matrix");
      for ( i = 0 ; i < r1 ; i++ )
         for ( j = 0 ; j < c1 ; j++ )
            a2[i][j] = s.nextInt();
    for ( i = 0 ; i < r1 ; i++ )
        for ( j = 0 ; j < c1 ; j++ )
            sum[i][j] = a1[i][j] + a2[i][j]; 
 
      System.out.println("Sum of the matrices:");
 
    for ( i = 0 ; i < r1 ; i++ )
    {
        for ( j = 0 ; j < c1 ; j++ )
            System.out.print(sum[i][j]+"  ");
 
        System.out.println();
    }
   }
}
