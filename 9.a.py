forg = open("org.txt",'r')
fcopy = open("copy.txt",'w')
a = forg.read().split()
l = list()
for i in a:
    l.append(i.lower())
l.sort() 
for i in l : 
    fcopy.write(i+" ")
forg.close()
fcopy.close()    