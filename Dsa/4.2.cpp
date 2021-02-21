#include<iostream>
#include<cmath>
using namespace std;
int main()
{
 int a[100]={NULL},i,n,s,m,p,key;
 cout<<"Enter the how many elements you want to enter in the hash table"<<endl;
 cin>>s;
 cout<<"Enter the value of p";
 cin>>p;
 for(i=0;i<s;i++)
 {
   cout<<"enter the number "<<endl;
   cin>>n;  
   key=floor(p*n*0.618032);
   a[key]=n;
}
 for(i=0;i<100;i++)
 {
   if(a[i]==NULL)
   continue;
   else
   cout<<"index="<<i<<" value="<<a[i]<<endl;
   }
   }
