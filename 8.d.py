n = int(input("enter the size of dictionary : "))
d = {}
for i in range(n):
    key = int(input("enter a new key : "))
    value = int(input("enter a new value : "))
    d[key] = value
print("sum of the values is : ",sum(list(d.values())))    