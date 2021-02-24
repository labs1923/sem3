#include<iostream>
using namespace std;
int i=1,j,a[100]={NULL},s;
void preorder(int a[],int j)
{ 
  cout<<a[j]<<" ";
  if(a[2*j]!=NULL)
     preorder(a,2*j);
  if(a[2*j+1]!=NULL)
     preorder(a,2*j+1);
}
int main()
{
    cout<<"enter the size of array"<<endl;
    cin>>s;
    cout<<"enter the elements"<<endl;
    for(i=1;i<=s;i++)
    cin>>a[i];
    cout<<"preorder : "<<endl;
    preorder(a,1);
}