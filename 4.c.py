a = input()
b = input()
print("string is present in it") if b in a else print("string is not present in it")

#(using regular expressions)
import re 
a = input()
b = input()
c= re.search(b,a)
if(c):
  print('present')
else:
  print('not present')
