n = int(input("enter number of proccess : "))
p = list(map(int,input("enter process:").split()))
print("1-FCFS 2-SJF")
bt = list(map(int, input("enter burst time : ").split()))        
priority = list(map(int,input("enter priority : ").split()))
 
 
queue1 = [[p[i],priority[i],bt[i]] for i in range(n) if priority[i] == 1 ]
queue2 = [[p[i],priority[i],bt[i]] for i in range(n) if priority[i] == 2 ]
ct = 0
def FCFS(q1,ct):
    CT = []
    for i in range(len(q1)):
        ct += q1[i][2]
        q1[i].append(ct)
        q1[i].append(ct)
        q1[i].append(ct-q1[i][2])
    # print(q1)
    return q1,ct
def SJF(q1,ct):
    CT = []
    q1.sort(key = lambda t:t[2])
    for i in range(len(q1)):
        ct += q1[i][2]
        q1[i].append(ct)
        q1[i].append(ct)
        q1[i].append(ct-q1[i][2])
    # print(q1)
    return q1,ct
 
q1,ct = FCFS(queue1,ct)
q2,ct = SJF(queue2,ct)
q = q1+q2
q.sort(key = lambda t:t[0])
print("p\tQP\tBT\tCT\tTAT\tWT")
print('-'*45)
for i in q:
  for j in i:
    print(str(j)+"\t",end="")
  print()