//Accept 12-hour time zone and convert into its corresponding 24-hour time zone using scanners.
//Note: Accept hours, minutes and seconds separately from the user (e.g. 07 05 45 PM should be displayed as 19:05:45).

import java.util.Scanner;     //Importing Scanner package.
public class Main
{
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);  //Creating scanner object sc.
    //hrs,min,sec,meredian are the scanner inputs.
		int hrs = sc.nextInt();
		int min = sc.nextInt();
		int sec = sc.nextInt();
		String meredian = sc.next();
		if((meredian.equals("pm")||meredian.equals("PM"))&&hrs != 12)
		    hrs += 12;
		if((meredian.equals("am")||meredian.equals("AM"))&&hrs == 12)
		    hrs = 0;
	    System.out.format("%02d:%02d:%02d",hrs,min,sec);
	}
}
