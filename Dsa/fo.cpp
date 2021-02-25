#include<iostream>
using namespace std;
void add(int a,int b){
  cout<<"result is "<<a+b<<endl;  
}
void add(int a,int b,int c){
    cout<<"result "<<a+b+c<<endl;
}
int main(){
    add(1,2);
    add(10,20,30);
    return 0;
}