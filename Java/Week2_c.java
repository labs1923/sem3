//  Write a program to accept contents into an Integer Array and print the frequency of each number in the order of their number of occurrences.
import java.util.*;
public class Week2_c{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt(),visited = -1;
        int arr[] = new int[size];
        int visited_arr[] = new int[size];
        //taking run time elements.
        for(int i = 0;i<size;i++)
            arr[i] = sc.nextInt();
        //counting the frequency and storing into an visited_array.
        for(int i = 0;i<size;i++){
            int count = 1;
            for(int j = i+1; j< size;j++){
                if(arr[i] == arr[j]){
                    count++;
                    visited_arr[j] = visited; 
                }  
                
            }
            if(visited_arr[i]!=visited)
                    visited_arr[i] = count;
        }
        //we are sorting the array and visited array on basis of visited_array.
        for(int i = 0; i < size ; i++){
                 for(int j=0;j<size-i-1;j++){
                        if(visited_arr[j] > visited_arr[j+1] ){
                            int temp;
                            //swapping elements of visited array.
                            temp = visited_arr[j];
                            visited_arr[j] = visited_arr[j+1];
                            visited_arr[j+1] = temp;
                            //swapping elements of array.
                            temp = arr[j];
                            arr[j] = arr[j+1];
                            arr[j+1] = temp;
                        }
                    }
            }
        System.out.println("--------------");
            
           for(int i=0;i<size;i++){
                if(visited_arr[i] != visited){
                   
                    System.out.println(arr[i]+"|"+visited_arr[i]);

                }
           }
        System.out.println("--------------");
    }
}