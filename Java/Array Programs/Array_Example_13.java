//27. Write a Java program to find the number of even and odd integers in a given array of integers.
import java.util.Scanner;
class Array_Example_13{
	public static void main(String args[]){
		int a[]=new int[100];
        int sum_even=0,sum_odd=0,i,j;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of Array:");
		j = s.nextInt();
        System.out.println("Enter elements of Array:");
		for(i=0;i<j;i++){
            a[i]=s.nextInt();
        }
        for(i=0;i<j;i++){
            if(a[i]%2==0){
                sum_even=sum_even+1;
            }
            else{
                sum_odd+=1;
            }
        }
        System.out.println("Number of even numbers is "+sum_even+"\n Number of odd numbers is "+sum_odd);
	}
}