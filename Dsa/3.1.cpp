#include<iostream>
using namespace std;
int main()
{
    int a[100],i,j,n;
    cout<<"enter the size of the array"<<endl;
    cin>>n;
    cout<<"enter the elements of the array"<<endl;
    for(i=0;i<n;i++)
    cin>>a[i];
    for(i=0;i<n;i++)
    {
        for(j=0;j<n-i;j++)
        if(a[j+1]<a[j])
        {
            a[j] = a[j+1]+a[j]-(a[j+1]=a[j]);
        }
    }
    for(i=0;i<n;i++)
    cout<<a[i]<<" ";
    return 0;
}