#include<iostream>
using namespace std;
int i=1,j,a[100]={NULL},s;
void postorder(int a[],int j)
{
  if(a[2*j]!=NULL)
     postorder(a,2*j);
  if(a[2*j+1]!=NULL)
     postorder(a,2*j+1);
  cout<<a[j]<<" ";
}
int main()
{
    cout<<"enter the size of array"<<endl;
    cin>>s;
    cout<<"enter the elements"<<endl;
    for(i=1;i<=s;i++)
    cin>>a[i];
    cout<<"postorder : "<<endl;
    postorder(a,1);
}