#include<bits/stdc++.h>
using namespace std;
int main()
{    int n,a,b,r,c=0,i=0;
stack <int> s;
    cout<<"enter a number"<<endl;
    cin>>n;
    cout<<"1.decimal to Binary"<<endl;
    cout<<"2.decimal to Ternary"<<endl;
    cout<<"3.decimal to Octa"<<endl;
    cout<<"Enter your choice"<<endl;
    cin>>a;
    switch(a){
        case 1 : b =2;
                 break;
        case 2 : b =3;
                 break;
        case 3 : b =8;
    }
    while(n>0)
    {
        r = n%b;
        n = n/b;
        s.push(r);
        c++;
    }
    while(c>0)
    {
        cout<<s.top();
        s.pop();
        c--;
    }
    }
