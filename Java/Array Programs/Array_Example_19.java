//30. Write a Java program to check if an array of integers without 0 and -1.
import java.util.*; 
 public class Array_Example_19 {
 public static void main(String[] args)
 {   int i,r1;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter number of numerical values:");
    r1 = s.nextInt();
    int array_nums[]=new int[r1];
    System.out.println("Enter numerical values:");
    for(i=0;i<r1;i++){
        array_nums[i] = s.nextInt();
    }
	System.out.println("Original Array: "+Arrays.toString(array_nums)); 
	System.out.println("Result: "+test(array_nums));
    }	
    public static boolean test(int[] numbers) {
    for (int number : numbers) {
      if (number == 0 || number == -1) {
        return false;
      }
    }
    return true;
  }  
}