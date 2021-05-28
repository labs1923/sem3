//Write a program that accepts an n ordered square matrix and calculate the absolute difference between the sums of elements in their diagonals.

import java.util.Scanner;
class week3_c{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt(),pd_sum = 0 ,sd_sum = 0;
        int[][] mat = new int[size][size];
        for(int i = 0 ; i < size ; i++)
            for(int j = 0 ; j < size ; j++)
                mat[i][j] = sc.nextInt();
        
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(i == j)
                   pd_sum += mat[i][j]; 
            }
        }

        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if((i+j) == (size-1))
                   sd_sum += mat[i][j]; 
            }
        }
        System.out.println("Difference = "+Math.abs(sd_sum - pd_sum));
    }
}