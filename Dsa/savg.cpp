#include<iostream>
using namespace std;
class stu{
    public:
    int marks;
    public :
    stu(int m){
        marks = m;
    }
};
float stuavg(stu s1,stu s2){
        return (s1.marks+s2.marks)/2;
    }
int main(){
    stu a(50),b(30);
    cout<<" avg marks : "<<stuavg(a,b);
}