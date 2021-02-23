#include<iostream>
using namespace std;
void enqueue();
void dequeue();
void display();
int queue[1000],priority[1000],s,rear=-1,front=-1;
int main(){
    int i,c=-1;
    cout<<"enter the size of the queue"<<endl;
    cin>>s;
    while(c!=0)
    {
      cout<<"0.exit\n1.enqueue\n2.dequeue\n3.display\nenter your choice"<<endl;
      cin>>c;
      switch(c){
          case 1: enqueue();
                  break;
          case 2: dequeue();
                  break;
          case 3: display();
                  break;
          default: if(c!=0) cout<<"enter correct choice"<<endl;                        
      }

    }
    return 0;
}
void enqueue()
{
    int data,p;
   if(front==0 && rear==s-1){
       cout<<"queue is full no further element can be taken to perform enqueue operation"<<endl;
        return;      
   }
   else
   {   cout<<"enter the data and priority"<<endl;
       cin>>data>>p;
       if(front==-1 && rear==-1){
           front=0;
           rear=0;
           queue[rear]=data;
           priority[rear]=p;
       }
       else{
           rear++;
           queue[rear]=data;
           priority[rear]=p;
           for(int i=front;i<=rear;++i)
           {
              for(int j=i+1;j<=rear;++j)
              if(priority[i]<priority[j])
               {
                priority[j] = priority[i]+priority[j]-(priority[i]=priority[j]);
                queue[j] = queue[i]+queue[j]-(queue[i]=queue[j]);
               }
            }
            for (int i = front; i <= rear ; i++)
               {
                   queue[i-front]=queue[i];
                   priority[i-front]=priority[i];
               }
               rear -=front;
               front=0;
           
       }
   }
   
}
void dequeue()
{
    if(front==-1)
    cout<<"queue is completely empty no further element is present to perform dequeue operation"<<endl;
    else if( front == rear)
    {
      front = -1;
      rear = -1;
    }
    else
     front++;

}
void display()
{
    if(front!=-1)
    {
    cout<<"queue elements are"<<endl;
    for(int i = front;i<=rear;i++)
    cout<<queue[i]<<" ";
    cout<<endl;
    }
    else
    cout<<"queue is empty"<<endl;
}
