#include<iostream>
#include<cmath>
using namespace std;
int main()
{
int a[1000]={NULL},i,p,key,k,z,count=0,x,r,q,u;
cout<<"enter no of hash keys"<<endl;
cin>>p;
cout<<"enter the numbers"<<endl;
for(i=0;i<p;i++)
{
cin>>k;
key=0;
count=0;
key=k*k;
z=key;
while (key!= 0) {
        key/= 10;    
        count++;
    }
x=z;
q=pow(10,count-1);
r=x%q;
u=r/10;
a[u]=k;
}
for(i=0;i<1000;i++)
{
if(a[i]==NULL)
continue;
else
cout<<"index="<<i<<"value="<<a[i]<<endl;
}
}