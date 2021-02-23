#include<iostream>
using namespace std;
void enqueue();
void dequeue();
void display();
int queue[100],front=-1,rear=-1,n;
int main()
{
    int c=-1;
    cout<<"enter the size of queue"<<endl;
    cin>>n;
    while(c!=0)
    {
      cout<<"0.exit\n1.enqueue\n2.dequeue\n3.display\nenter yor choice"<<endl;
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
}
void enqueue(){
    int data;
    if(front==0 && rear==n-1)  
    {  
        cout<<"queue is full no further element can be taken to perform enqueue operation"<<endl;
        return;  
    }  
    else if(front == -1 && rear == -1)  
    {  
        front = 0;  
        rear = 0;  
    }  
    else if(rear == n-1 && front != 0)   
      rear = 0;    
    else   
      rear = rear+1;   
    cout<<"enter the data"<<endl;
    cin>>data;
    queue[rear]=data;
}
void dequeue(){
    if(front==-1)
        cout<<"queue is completely empty no further element is present to perform dequeue operation"<<endl;
    else if(rear==front){
        rear=-1;
        front=-1;
    }
    else if(front==n-1)
        front=0;
    else
     front++;    
}
void display(){
    if(front==-1)
        cout<<"queue is empty"<<endl;
    else{
    cout<<"circular queue elements are:"<<endl;
    if(front<=rear){
        for(int i=front;i<=rear;i++)
        cout<<queue[i]<<" ";
        cout<<endl;
     }
    else if(rear<front){
        for(int i=front;i<n;i++)
        cout<<queue[i]<<" ";
        for(int i=0;i<=rear;i++)
        cout<<queue[i]<<" ";
        cout<<endl;
     }
    }
}
