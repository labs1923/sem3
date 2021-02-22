#include<iostream>
#include<cmath>
using namespace std;
int main()
{
int a[1000]={NULL},i,p,key,k,sum=0,q,s,temp,r;
cout<<"enter no of hash keys"<<endl;
cin>>p;
cout<<"enter the number"<<endl;
for(i=0;i<p;i++)
{
cin>>k;
temp=k;
sum=0;
while(k>100)
{
  r=k%100;
  sum=sum+r;
  q=k/100;
  k=q;
}
s=sum+k;
a[s]=temp;
}
for(i=0;i<1000;i++)
{
if(a[i]==NULL)
continue;
else
cout<<"index="<<i<<"value="<<a[i]<<endl;
}
}
