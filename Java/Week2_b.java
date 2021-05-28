//Write a program that accepts an array of integers and print those which are both odd and prime.
//If no such element in that array print Not found.
import java.util.Scanner;
public class Week2_b{
    //function to find prime or not.
    public static boolean prime(int num){
        int count = 0;
        for(int i=1; i <= num; i++){
            if(num%i == 0)
                count++;
        }
        return (count == 2)?true:false;
    }
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),flag = -1;
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        
        for(int i:arr){
            //if both the conditions are true it excecutess if statement.
            if(!(i%2==0)&&prime(i)){
                System.out.println(i+" is both odd and prime");
                flag++;
            }
        }

        if(flag == -1)
            System.out.println("element not found");
    }
}