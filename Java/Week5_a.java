class DivisionString
{
    static void divideString(String str, int n)
    {
    int str_size = str.length();
    int part_size;
    if (str_size % n != 0)
    {
        System.out.println("Invalid Input: String size" +
                                "is not divisible by n");
        return;
    }
    part_size = str_size / n;     
    for (int i = 0; i< str_size; i++)
    {
        if(i % part_size == 0)
            System.out.println();
        System.out.print(str.charAt(i));
    }
    }
    public static void main(String[] args)
    {
        String str = "a_simple_divide_string_quest";
        divideString(str, 4);
    }
}