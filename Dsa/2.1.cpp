#include<iostream>
using namespace std;
int main(){
    int i,a[100],r,s;
    cout<<"enter the size of array"<<endl;
    cin>>s;
    cout<<"enter the elements"<<endl;
    for(i=0;i<s;i++)
    cin>>a[i];
    cout<<"enter the element for searching"<<endl;
    cin>>r;
    for(i=0;i<s;i++)
    {
        if(a[i]==r)
        {
        cout<<"element found at "<<i+1<<" position"<<endl;
        break;
        }
    }
    if(i==s)
    cout<<"element not there in the list"<<endl;

}