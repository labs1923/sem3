#include <iostream>

using namespace std;

int stack[100], n=100, top=-1;

void push(int val) {

      top++;

      stack[top]=val;

}

int pop() {


   int a;

      a = stack[top];

      top--;

   return a;

}

void display()

{

      cout<<stack[top];
     
}

int main() 
{


   int a,i,val,x,y;

   cout<<"enter a number"<<endl;

   cin>>a; //no whose factorial is to be found



   if(a==0)

   cout<<"1"<<endl;


   else


   {

   for(i=a;i>0;i--)

   push(i);


   for(i=a;i>1;i--)

   {

   x = pop();

   y = pop();

   val = x*y;

   push(val);

   }

   display();
}
   return 0;

}
