//Accept a number n and print the list of n Fibonacci terms recursively using command line.
//Recursion.

public class Main
{
    public static int fib_rec(int x){
        return (x == 0 || x == 1)?x:fib_rec(x-1)+fib_rec(x-2); //Using Terinary Operator.
    }
    
	public static void main(String[] args) {
		int n1 = 0,n2 = 1,i=0;
		while(i<Integer.parseInt(args[0])){
		    System.out.print(fib_rec(i)+" ");
		    i++;
		}
	}
}
