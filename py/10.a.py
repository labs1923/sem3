class person() :
    def __init__(self,name,age,weight,height) :
        self.name = name
        self.age = age
        self.weight = weight
        self.height = height
    def get_bmi_result(self):
        result = float(self.weight/pow(self.height,2))
        if result < 18.5 :
            return "underweight"
        elif result >=18.5 and result < 25:
            return "Healthy"   
        else :
            return "obese"
p = person(input("Enter name "),input("Enter age "),float(input("Enter weight in kgs ")),float(input("Enter height in meteres ")))            
print(p.get_bmi_result())
