#include<iostream>
using namespace std;
int main()
{
   int n,i,a[100],j,key;
   cout<<"enter the number of elements:"<<endl;
   cin>>n;
   cout<<"enter the numbers"<<endl;
   for(i=0;i<n;i++)
   cin>>a[i];
   for(i=1;i<n;i++){
      key = a[i];
      j = i;
      while(j>0&&a[j-1]>key){
          a[j] = a[j-1];
          j--;
      }
      a[j] = key;

   }
   cout<<"elements after insertion sorting"<<endl;
   for(i=0;i<n;i++)
   cout<<a[i]<<" ";
 
return 0;

}
