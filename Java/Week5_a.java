/*Accept a String and a number „n‟ from user. Divide the given string into substrings each of size „n‟ and sort them lexicographically*/ 
import java.util.*;
class Week5_a{
    //returnig an array method.
    static String[] lexicographyOrder(String str,int part_size){
        String[] arr = new String[part_size];
        int index=-1 , break_at = str.length()/part_size;
        //braking the string to the size of partsize.
        //storing the divided strings into an array.
        while(!str.isEmpty()){
            String value = str.substring(0,break_at);
            arr[++index] = value;
            str = str.replace(value,"");
        }
        //sorting an array.
        Arrays.sort(arr);
        return arr;
    }
    public static void main(String s[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = sc.nextInt();//part size.

        //creating an array of the given part size.
        String arr[] = new String[n];
        
        //removing the spaces since the word cant start with spaces.
        str = str.replace(" ","");

        //if the string cannof form all equal parts.
        if(str.length()%n != 0)
            System.out.println("Cannot divide the string equally.");
        else{
            arr = lexicographyOrder(str,n);
        //printing an sorted array.
        for(String i:arr)
        System.out.println(i);
        }
    }
}
