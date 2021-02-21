#include<iostream>
using namespace std;
int main(){
    int i,a[100],r,s,low=0,high,mid;
    cout<<"enter the size of array"<<endl;
    cin>>s;
    high=s;
    cout<<"enter the elements"<<endl;
    for(i=0;i<s;i++)
    cin>>a[i];
    cout<<"enter the element for searching"<<endl;
    cin>>r;
    while(low<=high)
    {
      mid = (low+high)/2;
      if(a[mid]==r)
      {
      cout<<"element found at "<<mid+1<<" position"<<endl;
      break;
      }
      else if(r>a[mid])
      low = mid+1;
      else 
      high = mid-1;
    }
    if(low>high)
    cout<<"element not there in the list"<<endl;

}