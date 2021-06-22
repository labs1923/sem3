//28. Write a Java program to get the difference between the largest and smallest values in an array of integers. The length of the array must be 1 and above. 
import java.util.*; 
public class Array_Example_14 {
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
    int max,min;
    max = a[0];
    min = a[0];
    int len = a.length;
    for(i=0;i<len;i++){
        if(max<a[i]){
            max=a[i];
        }
        if(min>a[i]){
            min=a[i];
        }
    }
    System.out.println(" Original Array: "+Arrays.toString(a));
	System.out.println("Difference between the largest and smallest values of the array is : "+(max-min));	

    }
}