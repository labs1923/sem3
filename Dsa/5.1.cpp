#include<iostream>
using namespace std;
void push(int);
void pop();
void peak();
void display();
int stack[1000],s,top=-1;
int main()
{
    int c,i;
    cout<<"enter the size of the stack"<<endl;
    cin>>s;
    while(1)
    {
    cout<<"1.push\n2.pop\n3.peak\n4.display\n5.exit"<<endl;
    cout<<"enter your choice"<<endl;
    cin>>c;
    if(c==5)
    break;
    switch (c)
    {
    case 1: push(s);
        break;
    case 2: pop();
        break;
    case 3: peak();
        break;
    case 4: display();
        break;
    default:cout<<"enter correct choice"<<endl;
        break;
    }
    }
    return 0;
}
void push(int s)
{
    int n;
    if(top<s-1)
    {
        cout<<"enter the element"<<endl;
        cin>>n;
        stack[++top] = n;
    }
    else
        cout<<"stack is full no further element can be taken to perform push operation"<<endl;
}
void pop()
{
    if(top>=0)
       top--;
    else
        cout<<"stack is completely empty no further element is present to perform pop operation"<<endl;
}
void peak()
{
   cout<<"Top element of the stack is "<<stack[top]<<endl;
}
void display()
{
  cout<<"stack elements are"<<endl;
  for(int i=0;i<top+1;i++)
  cout<<stack[i]<<" ";
  cout<<endl;
}
