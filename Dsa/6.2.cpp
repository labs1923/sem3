#include<bits/stdc++.h>
#include <iostream>
#include<string>
using namespace std;
int main()
{
    int a,x1,x2,x3,x4,i=0;
    stack <int> s1;
    string str,t;
    char e;
    cout<<"Enter a postfix Expression "<<endl;
    getline(cin,str);
    cout<<str<<endl;
   stringstream X(str);
   while(getline(X,t,' '))
   {
       stringstream Y(t);
       Y>>a;
       stringstream Z(t);
       Z>>e;
        if(a==0 && e=='0')
        {   
           s1.push(a);
           cout<<"push value"<<a<<endl;
        }
        else if(a)
        {   
           s1.push(a);
           cout<<"push value"<<a<<endl;
        }
        else
        {
            x1=s1.top();
            cout<<"Value on top"<<x1<<"going to pop"<<endl;
            s1.pop();
            x2=s1.top();
            cout<<"value on top"<<x2<<"going to pop"<<endl;
            s1.pop();
            switch(e){
        case '+':
            x3=x1+x2;
            cout<<"push value"<<x3<<endl;
            s1.push(x3);
            break;
        case '-':
            x3=x2-x1;;
            s1.push(x3);
            cout<<"push value"<<x3<<endl;
            break;
        case '*':
            x3=x2*x1;
            s1.push(x3);
            cout<<"push value"<<x3<<endl;
            break;
        case '/':
            x3=x2/x1;
            s1.push(x3);
            cout<<"push value"<<x3<<endl;
            break;
        }

        }       
   }
   cout<<"ans is"<<s1.top()<<endl;
}