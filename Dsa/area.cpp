#include<iostream>
using namespace std;
class room
{
    public :
    int length,breadth,height;
    double calarea()
    {
        return length*breadth;
    }
    double calvol(){
        return length*breadth*height;
    }

};
int main(){
    room r;
    r.length = 10;
    r.breadth = 20;
    r.height = 30;
    cout<<"area is "<<r.calarea()<<endl;
    cout<<"volume is "<<r.calvol()<<endl;
    return 0;
}