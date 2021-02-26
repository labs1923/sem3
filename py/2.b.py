a,b = map(int,input().split())
def fun(a,b):
    return a+b,a*b
c,d = fun(a,b)
print("sum is "+str(c)+" and multiplication is "+str(d))    