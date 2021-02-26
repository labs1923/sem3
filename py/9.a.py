forg = open(input('Enter the source file name : '),'r')
fcopy = open(input('Enter the target file name : '),'w')
a = forg.read().split()
l = list()
for i in a:
    l.append(i.lower())
l.sort() 
for i in l : 
    fcopy.write(i+" ")
print("success")    
forg.close()
fcopy.close()    