//5. Write a Java program to test if an array contains a specific value. 
import java.util.*; 
public class Array_Example_4 {
public static void main(String[] args){   
    int i,r1,key,v=0;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter number of numerical values:");
    r1 = s.nextInt();
    int a[]=new int[r1];
    System.out.println("Enter numerical values:");
    for(i=0;i<r1;i++){
        a[i] = s.nextInt();
    }
    System.out.println("Enter element to be searched : ");
    key = s.nextInt();
    for(i=0;i<r1;i++){
        if(a[i]==key){
            System.out.println("The found at position " + (i+1));
            v=1;
        }
    }
    if(v==0){
        System.out.println("Element not found");
    }
    }
}