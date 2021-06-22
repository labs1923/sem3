n = int(input("enter number of proccess : "))
p = list(map(int,input("enter process:").split()))
print("1-SJF 2-PRIORITY")
bt = list(map(int, input("enter burst time : ").split()))        
queue_priority = list(map(int,input("enter queue priority : ").split()))
priority = list(map(int,input("enter priority : ").split()))

 
queue1 = [[p[i],priority[i],queue_priority[i],bt[i]] for i in range(n) if queue_priority[i] == 1 ]
queue2 = [[p[i],priority[i],queue_priority[i],bt[i]] for i in range(n) if queue_priority[i] == 2 ]
ct = 0
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
def PS(q1,ct):
    CT=[]
    q1.sort(key = lambda t:t[1])
    for i in range(len(q1)):
        ct += q1[i][3]
        q1[i].append(ct)
        q1[i].append(ct)
        q1[i].append(ct-q1[i][3])
    return q1,ct   
q1,ct = SJF(queue1,ct)
q2,ct = PS(queue2,ct)
q = q1+q2
q.sort(key = lambda t:t[0])
print("p\tpri\tQP\tBT\tCT\tTAT\tWT")
print('-'*50)
for i in q:
  for j in i:
    print(str(j)+"\t",end="")
  print()