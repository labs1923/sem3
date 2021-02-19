a  = list(input("enter the keys : ").split())
b = list(input("enter the values : ").split())
d = {}
for i in range(len(a)):
    d[a[i]] = b[i]  
s = input("enter the search key ")
print("Found") if s in d.keys() else print("Not Found")    
