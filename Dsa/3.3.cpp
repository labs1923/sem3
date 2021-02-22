#include<iostream>
#include <stdlib.h>
using namespace std;
void quicksort(int [], int, int);
int partition(int [], int, int);
int main()
{
int arr[100];
int i,n;
cout<<"enter no.of elements\n";
cin>>n;
cout<<"enter the elements\n";
for(i=0;i<n;i++)
cin>>arr[i];
quicksort(arr, 0, n-1);
cout<<"the sorted elements are ";
for(i=0;i<n;i++)
cout<<arr[i]<<" ";
}
void quicksort(int arr[], int s, int e)
{
int p;
if (s<e)
{
p=partition(arr, s, e);
quicksort(arr, s, p-1);
quicksort(arr, p+1, e);
}
}
int partition(int arr[], int s, int e)
{
int pivot, pindex, i, temp;
pivot=arr[s];
pindex=e;
for(i=e; i>=s+1; i--)
{
if (arr[i]>=pivot)
{
temp=arr[i];
arr[i]=arr[pindex];
arr[pindex]=temp;
pindex--;
}
}
temp=arr[s];
arr[s]=arr[pindex];
arr[pindex]=temp;
return pindex;
}
