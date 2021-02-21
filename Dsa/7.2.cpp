#include<iostream>
using namespace std;
#define n 5
int insert();
int remove();
int show();
int queue[n] , prio[n];
int f=-1,r=-1;


int main(){
    int c;
     char m;
     do{
    cout<<"1.Insertion\n2.Delete\n3.Display\n4.Exit"<<endl;
    cout<<"enter choice"<<endl;
    cin>>c;
    switch (c)
    {
     case 1: insert();
              break;
     case 2: remove();
              break;
    case 3:  show();
              break;
    case 4: exit(0);
              break;
    default: cout<<"enter correct choice"<<endl;
        break;
    }
     
 }while(m=='y'||m=='Y');
 return 0;
}



int insert(){
    int e,p,i;
    if(f==0 && r==n-1)
      cout<<"Queue is full\n element cannot be inserted"<<endl;
    else
    { 
          cout<<"enter the elemnt and priority"<<endl;
          cin>>e>>p;
         if(f==-1  )
           {
               f=0;
               r=0;
               queue[r]=e;
               prio[r]=p;
            return 0;
           }
           if(r==n-1)
           {
               for (i = f; i <= r ; i++)
               {
                   queue[i-f]=queue[i];
                   prio[i-f]=prio[f];
               }
               r=r-f;
               for (i = r; i < f; i--)
               {
                   if(p>prio[i])
                   {
                       queue[i+1]=queue[i];
                       prio[i+1]=prio[i];
                   }
                   else
                        break;
               }
               prio[i+1]=p;
               queue[i+1]=e;
               
           }
        else
        {
            for (i = r; i>=f; i--)
             {
                if (p>prio[i])
                 {
                    queue[i+1]=queue[i];
                    prio[i+1]=prio[i];
                }
                else
                     break;
           
       }
       queue[i+1]=e;
       prio[i+1]=p;
       r++;
        }
         cout<<"element inserted succesfully"<<endl;
    }
   
    return 0; }


int show(){
    int i;
    //cout<<”Queue is “<<endl;
    for ( i = f ; i <= r ; i++)
    {
         cout<<"element - "<<queue[i]<<" and "<<"priority - "<<prio[i]<<endl;
    }
    return 0;
}


int remove(){
  if(f==-1){
    cout<<"underflow\n cannot delete elements"<<endl;
    return 0;
  }
  else
  {
       cout<<"element - "<<queue[f]<<" with priority "<<prio[f]<<" is deleted"<<endl;
       if(f==r)
           f=r=-1;
        else
           f=f+1;
  }
  

    return 0;
}

