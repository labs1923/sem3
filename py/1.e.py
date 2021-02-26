for i in range(20,50):
    b = 0
    for j in range(1,i):
        if(i%j==0): b+=1
    if(b==1) : print(str(i) +" is a prime number")     