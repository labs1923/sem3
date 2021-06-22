//63. Write a Java program to replace each element of the array with product of every other element in a given array of integers.
import java.util.*;

class Array_Example_18
{	public static void main(String[] args)
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
        

		int n = r1;

		int[] left_element = new int[n];
		int[] right_element = new int[n];

		left_element[0] = 1;
		for ( i = 1; i < n; i++) {
			left_element[i] = a[i - 1] * left_element[i - 1];
		}

		right_element[n - 1] = 1;
		for (int j = n - 2; j >= 0; j--) {
			right_element[j] = a[j + 1] * right_element[j + 1];
		}

		for (i = 0; i < n; i++) {
			a[i] = left_element[i] * right_element[i];
		}
        System.out.println(Arrays.toString(a));


	}
}
