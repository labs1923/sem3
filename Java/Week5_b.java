//  Accept an array of strings and display the number of vowels and consonants occurred in
// each string.
import java.util.*;
class Week5_b{
    static int vowels , consonants ;
    static void count(String str){
        vowels = 0; consonants = 0;
        for(int i = 0 ; i < str.length() ; i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {    
                vowels++;        // counting vowels.
            }    
            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {      
                consonants++;    // counting consonants.    
            }
        }
    } 
    public static void main(String... args){
        //creating scanner class.
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String[] str =  new String[size];
        sc.nextLine();
        for(int i = 0 ; i < size ; i++){
            str[i] = sc.nextLine();
        }
        //printing the vowels and consonants.
        for(String s: str){
            count(s.toLowerCase());
            System.out.println("For string "+s);
            System.out.println("no of vowels occured in a string = "+vowels);
            System.out.println("no of consonants occured in a string = "+consonants);
            System.out.println();
        }      
    }
}
