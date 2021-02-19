def count(str):
    d = dict()
    for i in str:
        if i in d.keys():
           d[i] += 1
        else :
            d[i] = 1
    return d 
l = []
a = count(input("enter string : "))
for i in range(int(input("enter n : "))):
    m =  max(a.values())
    l.append({key:val for key, val in a.items() if val == m})
    a = {key:val for key, val in a.items() if val != max(a.values())}
print(l)