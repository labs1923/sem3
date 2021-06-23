class Week6_b{
    public static void main(String[] args){
        Figure_3D[] obj3D = new Figure_3D[4];
        obj3D [0] = new Cylinder();
        obj3D [1] = new Cone();
        obj3D [2] = new Sphere();
        obj3D [3] = new Cube();
        obj3D [0].volume();
        obj3D [1].volume();
        obj3D [2].volume();
        obj3D [3].volume();
    }
}
class Figure_3D{
    void volume(){
    }
}
class Cylinder extends Figure_3D{
    void volume(){
        int radius=5,height=10;
        System.out.println("Volume of cylinder = "+(3.14*radius*radius*height));
    }
}
class Cone extends Figure_3D{
    void volume(){
        int radius=5,height=6;
        System.out.println("Volume of cone = " +((3.14*radius*radius*height)/3));
    }
}
class Sphere extends Figure_3D{
    void volume(){
        int radius=3;
        System.out.println("Volume of sphere = "+((4*3.14*radius*radius*radius)/3));
    }
}
class Cube extends Figure_3D{
    void volume(){
        int side=9;
        System.out.println("Volume of cube = " + (side*side*side));
    }
}
