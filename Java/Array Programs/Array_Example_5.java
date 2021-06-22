//10. Write a Java program to find the maximum and minimum value of an array.
import java.util.*; 
public class Array_Example_5 {
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
    System.out.println(" Maximum value for the above array = " + max);
    System.out.println(" Minimum value for the above array = " + min);
    
    }
}