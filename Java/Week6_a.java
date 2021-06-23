public class Week6_a{
    public static void main(String[] args)
    {
        Cost c = new Cost();
        c.display();
    }
}
class Vehicle{
    String v="Car";
}
class Brand extends Vehicle{
    String[] b={"Ferrari sf90 stradale","Mercedes Benz","Bugatti","Bentley Turbo R","Lamborghini"};

}
class Cost extends Brand{
    int r[]={75000000,5000000,55000000,65000000,95000000};
    Cost(){     
    }
    void display(){
        System.out.println("Vehicle Type : " +v);
        for(int i=0;i<5;i++){  
            System.out.println("Brand of the vehicle :" +b[i]);
            System.out.println("Cost of the vehicle : "+r[i]);
        }
    }
}
