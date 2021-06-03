// Accept two strings from the user and determine if the strings are anagrams or not.
class Week5_c{
    static boolean anagrams(String str1 ,String str2){
        //conve3rting to lower casse and making an array.
        char[] ch_str1  =  str1.toLowerCase().toCharArray();
        char[] ch_str2  =  str2.toLowerCase().toCharArray();
        //sorting the arrays.
        java.util.Arrays.sort(ch_str1);
        java.util.Arrays.sort(ch_str2);
        //check weathefr the arrays are equal.
        return java.util.Arrays.equals(ch_str1,ch_str2);
    }
    public static void main(String... args){
        String str1 = args[0] , str2 = args[1];
        //checking the condition.
        String str = anagrams(str1,str2)?
                        "Both the strings are anagrams"
                        :"Both the strings are not anagrams";
        System.out.println(str);
    }
}