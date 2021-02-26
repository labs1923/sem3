def vcount(s):
    l = list(i for i in s if i in "aeiouAEIOU")
    return len(l)
a = input().split()
print(sorted(a,key=vcount))    