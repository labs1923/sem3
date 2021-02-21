#include<iostream>
#include<cmath>
using namespace std;
int main()
{
int a[100]={NULL},i,p,key,n,k;
cout<<"number of elements"<<endl;
cin>>p;
cout<<"enter size of table";
cin>>n;
for(i=0;i<p;i++)
{
cout<<"enter the key value"<<endl;
cin>>k;
key=k%n;
a[key]=k;
}
for(i=0;i<100;i++)
{
if(a[i]==NULL)
continue;
else
cout<<"index="<<i<<"value="<<a[i]<<endl;
}
}
