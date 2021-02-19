class Circle(object) :
    def __init__ (self,radius):
        self.radius = radius 
    def area(self) :
        return pow(self.radius,2)*3.14
    def perimeter(self) :
        return 6.28*self.radius
a = Circle(float(input("enter radius : ")))     
print("area of the circle is ",a.area())
print("perimeter of the circle is ",a.perimeter())
