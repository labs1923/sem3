#include<iostream>
using namespace std;
int main(){
    int a[100],n,i,c=0,fibm=1,m1=1,m2=0,offset=0,l,s;
    cout<<"enter the size of the array"<<endl;
    cin>>n;
    cout<<"enter the elements"<<endl;
    for(i=0;i<n;i++)
    cin>>a[i];
    cout<<"enter the search element"<<endl;
    cin>>s;
    i=0;
    while(fibm<n){
		m2=m1;
	    m1=fibm;
		fibm=m1+m2;	       
		}   
	while(c<=n+1)
    {  
      l=offset+m2;
      i = (n>l)?l:n;
      if(a[i]==s)
      {
          cout<<"element found at "<<i+1<<" position"<<endl;
          i = -1;
          break;
      }
      else if(a[i]>s)
      {
          fibm = m2;
          m1 = m1-m2;
          m2 = fibm-m1;
          c++;
      }
      else
      {
          fibm = m1;
          m1 = m2;
          m2 = fibm - m1;
         offset =i;
          c++;
      }
      
    }
    if(a[0]==s)
    cout<<"element found at 1 position"<<endl;
    else if(i!=-1)
    cout<<"element not found in the list"<<endl;
    return 0;
}

