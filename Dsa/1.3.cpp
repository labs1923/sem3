#include<iostream>
using namespace std;
int gcd(int a,int b);
int main()
{
    int a,b,g;
    cout<<"enter 2 number"<<endl;
    cin>>a>>b;
    g = gcd(a,b);
    cout<<"gcd of "<<a<<" and "<<b<<" is "<<g<<endl;
    return 0;
}
int gcd(int a,int b){
    if (b==0)
    {
        return a;
    }
    else
    {
        return gcd(b,a%b);
    }
    
    
}