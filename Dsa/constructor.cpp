#include<iostream>
using namespace std;
class rec
{
    private:
    float len;
    float b;
    public :
    rec(int a,int br){
        len = a;
        b = br;
    }
    double area()
    {
        return len*b;
    }
};
int main(){
    rec r(10,20);
    cout<<"area "<<r.area()<<endl;

}