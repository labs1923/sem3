def count(str):
    d = dict()
    for i in str:
        if i in d.keys():
           d[i] += 1
        else :
            d[i] = 1
    return d
forg = open("org.txt",'r')
a = forg.read().split()
l = list()
for i in a:
    l.append(i.lower())   
d = count(l)
max = max(d.values())
for key,val in d.items():
    if val == max :
        print(key,val)
forg.close()  