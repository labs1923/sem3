//  Accept an array of strings and display the number of vowels and consonants occurred in
// each string.
import java.util.*;
class Week5_b{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //converting tring to lower case.
        str = str.toLowerCase();
        int vowels = 0 , consonants = 0;

        for(int i = 0 ; i < str.length() ; i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {    
                vowels++;        // counting vowels.
            }    
            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {      
                consonants++;    // counting consonants.    
            }
        }
        System.out.println("no of vowels occured in a string = "+vowels);
        System.out.println("no of consonants occured in a string = "+consonants);
    }
}