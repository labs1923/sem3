// Create a new class called Calculator with the following methods:
// o A static method called powerInt(int num1,int num2)
//  This method should return num1 to the power num2.
// o A static method called powerDouble(double num1,double num2).
//  This method should return num1 to the power num2.
// o Invoke both the methods and test the functionality. Also count the number of objects
// created.

class Week4_b{
    
    public static void main(String... args){
        double a = Double.parseDouble(args[0]),b = Double.parseDouble(args[1]);
        Calculator obj1 = new Calculator(2,5);
        System.out.println(obj1.powerInt());
        Calculator obj2 = new Calculator(3,7);
        System.out.println(obj2.powerInt());
        Calculator obj3 = new Calculator(a,b);
        System.out.println(obj3.powerInt());
        System.out.println("The no of objects created are "+Calculator.count);
    }
}

class Calculator{
static double base , power;
static int count;
    Calculator(double b ,double p){
        base = b;
        power = p;
    }
    static double powerInt(){
        count++;
        int ans = 1;
        for(int i = 0;i < power ; i++)
            ans *= base;
        return ans;
    }
}