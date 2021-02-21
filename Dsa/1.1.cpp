#include<iostream>
using namespace std;
int factorial(int n);
int main()
{
int n;
cout<<"enter  a positive integer: ";
cin>>n;
cout<<"Factorial of "<<n<<"="<<factorial(n);
return 0;
}
int factorial(int n)
{
if(n>1)
	return n* factorial (n-1);
else 
	return 1;
}
/*
#include<iostream>
using namespace std;
int factorial(int);
int main(){
    int a;
    cin>>a;
    cout<<"fact of a given number is "<<factorial(a);
}
int factorial(int x)
{
    if(x==1)
    return 1;
    else 
    return x*factorial(x-1);
}*/