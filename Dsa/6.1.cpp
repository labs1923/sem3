#include<iostream>
#define max 1000
using namespace std;
int stack[max];
int top=-1;
int factorial(int n)
{
    int fact=1;
    while(n!=0)
    {
        top++;
        stack[top]=n;
        if(top==max)
        {
            cout<<"Stack is over flow";
            exit(0);
        }
        n--;
    }
    while(top!=-1)
    {
        fact=fact*stack[top];
        top--;
    }
    return fact;
}
int main()
{
    int n,fact;
    cout<<"enter the number:";
    cin>>n;
    if(n<0)
    {
        cout<<"enter valid input!!";
    }
    else
    {
        fact=factorial(n);
        cout<<"factorial of "<<n<<" is "<<fact;
    }
}
