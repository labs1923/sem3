
#include<iostream>
using namespace std;
void enqueue();  
void dequeue();  
void display();  
int front = -1, rear = -1;  
int queue[5],n=5;  
int main ()  
{  
     int choice;  
    char m;
    bool y= true; 
    cout<<"1.enqueue operation\n2.Dequeue operation\n3.Display the queue\n4.Exit"<<endl;
    while(y)   
    {     
        cout<<"Enter your choice"<<endl;
        cin>>choice;
        switch(choice)  
        {  
            case 1:  
            enqueue();  
            break;  
            case 2:  
            dequeue();  
            break;  
            case 3:  
            display();  
            break;  
            case 4:  
            exit(0);  
            break;  
            default:   
            cout<<"Enter valid choice"<<endl;
        } 
        cout<<"do you wnt to continue ";
        cin>> m;
        if ( m=='y' || m =='Y')
            y=true;
        else y=false;
        
    }  
}  


void enqueue()  
{  
    int val; 
    cout<<"Enter the element"; 
    cin>>val;
    if(front==0 && rear==n-1)  
    {  
        cout<<"over flow occured"<<endl;
        return;  
    }  
    else if(front == -1 && rear == -1)  
    {  
        front = 0;  
        rear = 0;  
    }  
    else if(rear == n-1 && front != 0)   
    {  
        rear = 0;  
    }  
    else   
    {  
        rear = rear+1;  
    }  
    cout<<"Value entere"<<endl;
    queue[rear] = val;  
   
}  
void dequeue()  
{     
    if(front == -1)  
    {  
        cout<<"under flow occured"<<endl;
        return;  
    }  
    else if(front == rear)  
    {  
        front = -1;  
        rear = -1;  
    }  
    else if(front == n-1)  
        {  
            front = 0;  
        }  
    else   
        front = front + 1;  
}  
      
void display()  
{  
   int i;        
   if(front == -1)
   cout<<"Circular Queue is Empty!!"  <<endl;
   else  
   {  
      i = front;  
      cout<<"Circular Queue Elements are :"<<endl; 
      if(front <= rear){  
     while(i <= rear)  
     cout<<queue[i++]<<endl;
      }  
      else{  
     while(i <= n - 1)  
     cout<<queue[i++]<<endl;
     i = 0;  
     while(i <= rear)  
     cout<<queue[i++]<<endl;
      }  
   }  
}
