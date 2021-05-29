// Write a program that accepts an m x n double dimension array, where m represents
// financial years and n represents Ids of the items sold. Each element in the array represents
// the number of items sold in a particular year. Identify the year and id of the item which has
// more demand.

import java.util.Scanner;
class Week3_b{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        //m = financial years
        //n = ids of the items sold.
        int m = sc.nextInt() , n = sc.nextInt(); 
        int[] years = new int[m], item_id = new int[n]; 

        //Entering the years into an array.
        System.out.println("Enter the years :");
        for(int i= 0 ; i < m ; i++)
            years[i] = sc.nextInt();

        //Entering the item_ids into an array.
        System.out.println("Enter the item ids :");
            for(int i = 0 ; i < n ; i++)
                item_id[i] = sc.nextInt();
        
        int[][] table = new int[2025][2025];
        
        //Entering the items sold into the table.
        System.out.println("Enter the no of items sold :");
        for(int i : years){
            for(int j : item_id){
                table[i][j] = sc.nextInt();
            }
        }

        //printing the table.
        System.out.print("     | ");
        for(int i : item_id)
            System.out.print(String.format("%2d",i)+" ");
        System.out.println("\n-------------------------------");
        for(int i : years){
            System.out.print(i+" | ");
            for(int j: item_id){
                System.out.print(String.format("%2d",table[i][j])+" ");
            } 
            System.out.println();           
        }

        //finding the max demand.
        int max_demand = table[m-1][n-1] , demand_year = years[m-1] , demand_id = item_id[n-1];
        for(int i : years){
            for(int j : item_id){
                if(table[i][j] > max_demand){
                    max_demand = table[i][j];
                    demand_year = i;
                    demand_id = j;
                }
            }
        }
       System.out.print("The item id : "+demand_id+" has the max demand of ");
       System.out.print(max_demand+" in the year "+demand_year); 
    }
}
