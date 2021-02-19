a = list(map(int,input("list 1 = ").split()))
b = list(map(int,input("list 2 = ").split()))
c = a+b
print("list after addition is",c)
c.insert(3,0)
print("list after inserting 0 at 3rd postion is",c)
print("list slicing from 1 to 5",c[1:6])
