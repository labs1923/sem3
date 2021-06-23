n = int(input("enter number of process : "))                           
process = list(map(str, input("enter process names : ").split()))   
priority = list(map(int,input("enter priority : ").split()))
priority1 = priority.copy()  
Arrival_time = list(map(int, input("enter arrival time : ").split()))  
Arrival_time1 = Arrival_time.copy()      
Burst_time = list(map(int, input("enter burst time : ").split()))        
gantt_chart = []
completion_time = [0]*(n)
waiting_time = [0]*(n)
turn_around_time = [0]*(n)
response_time = [0]*n
val = 0
flag = 0
total_waiting_time = 0
total_turn_around_time = 0
x = Arrival_time.index(min(Arrival_time))
for i in range(n):
    if priority [x]==99999:
         break
    if Arrival_time [x]>val:
         #val = At[x]
         flag = 1
         x1 = x
         x2 = min(priority )
         priority [x1]=99999
         x = priority .index(min(priority ))
         
         
    gantt_chart  = gantt_chart + [(process[x])]
    completion_time[x] = val + Burst_time[x]
    turn_around_time[x] = completion_time[x]-Arrival_time [x]
    waiting_time [x] = turn_around_time[x]-Burst_time[x]
    response_time [x] = val-Arrival_time [x]        #val-At[x]
    val += Burst_time[x]
    priority[x]=99999 
    Arrival_time[x]=99999
    x = priority.index(min(priority))
    if flag==1:
         x=x1
         priority[x1]=x2
         flag = 0
    total_waiting_time += waiting_time[i]
    total_turn_around_time += turn_around_time[i]
    
print("Process  Priority   ArrivalTime   BurstTime   CompletionTime   TurnAroundTime  WaitingTime  Responsetime")
for i in range(0,len(process)):
    print("  ",process[i],"   \t",priority1[i],"    \t", Arrival_time1[i],"   \t",Burst_time[i],"\t\t",completion_time[i],"\t\t",turn_around_time[i],"\t\t",waiting_time[i],"\t\t",response_time[i])
print("Average Waiting time is : ",float(total_waiting_time/n))
print("Average Turn Around Time is : ",float(total_turn_around_time/n))
print("Gantt Chart :: ",gantt_chart)