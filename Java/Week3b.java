import java.util.Scanner;
public class Week3b {
    public static void main(String[] args) {
        int m,n,max,y=0,id=0,i,j;
        Scanner s =new Scanner(System.in);
        System.out.println("enter the number of Years: ");
        m=s.nextInt();
        System.out.println("enter the number of Items : ");
        n=s.nextInt();
        int a[][] = new int[m][n];
        System.out.println("enter the  matrix : ");
            for(i=0;i<m;i++)
            {
                for(j=0;j<n;j++)
                {
                    a[i][j]=s.nextInt();
                }
                
            }
             max=a[0][0];
            for(i=0;i<m;i++)
            {
                for(j=0;j<n;j++)
                {
                    if(max<a[i][j])
                    {
                        max=a[i][j];
                        y=i;
                        id=j;
                    }
                }
                
            }

            System.out.println("Item with ID : "+(id+1) + " has more demand in Year : "+(y+1));
            s.close();
    }
}
