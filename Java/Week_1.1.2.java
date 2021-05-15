//Accept 12-hour time zone and convert into its corresponding 24-hour time zone using command line.
//Note: Accept hours, minutes and seconds separately from the user (e.g. 07 05 45 PM should be displayed as 19:05:45).

public class Main
{
	public static void main(String[] args) {
    //args[0] , args[1] , args[2] , args[3] are the command line inputs.
    //Integer.parseInt converts the string to an integer.
		int hrs = Integer.parseInt(args[0]);  
		int min = Integer.parseInt(args[1]);
		int sec = Integer.parseInt(args[2]);
		String meredian = args[3];
    //.equals is used to compare two strings.
		if((meredian.equals("pm")||meredian.equals("PM"))&&hrs != 12)
		    hrs += 12;
		if((meredian.equals("am")||meredian.equals("AM"))&&hrs == 12)
		    hrs = 0;
    //System.out.format is used whe we use format specifiers in a print statement.
	    System.out.format("%02d:%02d:%02d",hrs,min,sec);
	}
}
