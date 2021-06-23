n = int(input("enter number of process : "))                           
process = list(map(str, input("enter process names : ").split()))   
Arrival_time = list(map(int, input("enter arrival time : ").split()))      
Burst_time = list(map(int, input("enter burst time : ").split())) 
t = int(input("Time Quantum : "))
At1 = sorted(Arrival_time)
Bt1 = Burst_time.copy()
gantt_chart = []
ready_queue = []
completion_time = [0]*(n)
waiting_time = [0]*(n)
turn_around_time = [0]*(n)
response_time = [0]*n
val = cnt = flg = i = 0
s = sum(Burst_time)

while (max(completion_time)!=s):
    while(i<len(At1) and cnt>=At1[i]):
        ready_queue.append(At1[i])
        i+=1

    if flg==1:
        ready_queue.append(Arrival_time[x])
        
    x = Arrival_time.index(ready_queue[0])
    if process[x] not in gantt_chart:
        response_time[x] = val-Arrival_time[x] 
    gantt_chart.append(process[x])

    ready_queue.remove(Arrival_time[x])
    if Burst_time[x]<=t and Burst_time[x]!=0:
        completion_time[x] = Burst_time[x] + cnt
        turn_around_time[x] = completion_time[x]-Arrival_time[x]
        waiting_time[x] = turn_around_time[x]-Bt1[x]
        val += Burst_time[x]
        cnt +=Burst_time[x]
        Burst_time[x]=0
        flg=0

    else:
        Burst_time[x] = Burst_time[x]-t
        cnt+=t
        val = cnt
        flg=1           

print("Process   ArrivalTime   BurstTime   CompletionTime   TurnAroundTime  WaitingTime  ResponseTime")
for i in range(0,len(process)):
    print("  ",process[i],"   \t",Arrival_time[i],"   \t",Bt1[i],"\t\t",completion_time[i],"\t\t",turn_around_time[i],"\t\t",waiting_time[i],"\t\t",response_time[i])        

print("Gantt Chart     :",gantt_chart)
print("Avg Turn Around Time:", round(sum(turn_around_time)/n,3))
print("Avg Wating Time     :", round(sum(waiting_time)/n,3))