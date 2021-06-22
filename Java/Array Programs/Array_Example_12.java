//24. Write a Java program to find a missing number in an array.
import java.util.*;
public class Array_Example_12 {
 public static void main(String[] args) {
    int i,r1,n;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter number of numerical values array:");
    r1 = s.nextInt();
    int a[]=new int[r1];
    System.out.println("Enter numerical values:");
    for(i=0;i<r1;i++){
        a[i] = s.nextInt();
    }
    n = a[r1-1];
    int expected_sum = (n*(n + 1)) / 2;

    int sum = 0;
    for (i=0;i<r1;i++) {
        sum += a[i];
    }
    System.out.print(expected_sum - sum);
	System.out.print("\n");
  }
 }