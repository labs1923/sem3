n = int(input("enter number of process : "))                           
process = list(map(str, input("enter process names : ").split()))   
Arrival_time = list(map(int, input("enter arrival time : ").split()))        
Burst_time = list(map(int, input("enter burst time : ").split()))  
Burst_time1 =Burst_time.copy() 
gantt_chart = []
completion_time = [0]*(n)
waiting_time = [0]*(n)
turn_around_time = [0]*(n)
response_time = [0]*n
val = 0
total_waiting_time = 0
total_turn_around_time = 0
x = Arrival_time.index(min(Arrival_time))
for i in range(n):
    if Burst_time[x]==99999:
         break
    if Arrival_time[x]>val:
         #val = At[x]
         x = Arrival_time.index(min(Arrival_time))
    gantt_chart = gantt_chart + [(process[x])]
    completion_time[x] = val + Burst_time[x]
    turn_around_time[x] = completion_time[x]-Arrival_time[x]
    waiting_time [x] = turn_around_time[x]-Burst_time[x]
    response_time[x] = val-Arrival_time[x]
    val = completion_time[x]
    Burst_time[x]=99999 
    x = Burst_time.index(min(Burst_time))
    total_waiting_time += waiting_time[i]
    total_turn_around_time += turn_around_time[i]

print("Process   ArrivalTime   BurstTime   CompleteTime   TurnAroundTime  WaitingTime  ResponseTime")
for i in range(0,len(process)):
    print("  ",process[i],"   \t",Arrival_time[i],"   \t",Burst_time1[i],"\t\t",completion_time[i],"\t\t",turn_around_time[i],"\t\t",waiting_time[i],"\t\t",response_time[i])
print("Average Waiting time is : ",float(total_waiting_time/n))
print("Average Turn Around Time is : ",float(total_turn_around_time/n))
print("Gantt Chart :: ",gantt_chart)