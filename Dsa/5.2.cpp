#include<iostream>
using namespace std;
void enqueue(int);
void dequeue();
void display();
int queue[1000],s,rear=-1,front=0;
int main(){
    int i,c;
    cout<<"enter the size of the queue"<<endl;
    cin>>s;
    while(1)
    {
    cout<<"1.enqueue\n2.dequeue\n3.display\n4.exit"<<endl;
    cout<<"enter your choice"<<endl;
    cin>>c;
    if(c==4)
    break;
    switch (c)
    {
    case 1: enqueue(s);
        break;
    case 2: dequeue();
        break;
    case 3: display();
        break;
    default:cout<<"enter correct choice"<<endl;
        break;
    }
    }
    return 0;
}
void enqueue(int s)
{
    int n;
    if((rear-front)==s-1)
        cout<<"queue is full no further element can be taken to perform enqueue operation"<<endl;
    else
    {
        cout<<"enter the element"<<endl;
        cin>>n;
        queue[++rear] = n;
    }
}
void dequeue()
{
    if(rear-front<0)
        cout<<"queue is completely empty no further element is present to perform dequeue operation"<<endl;
    else
        front++;
}
void display()
{
    cout<<"queue elements are"<<endl;
    for(int i = front;i<=rear;i++)
    cout<<queue[i]<<" ";
    cout<<endl;
}