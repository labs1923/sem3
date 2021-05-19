#include<iostream>
using namespace std;
#include<iomanip>
int main(){
    int s,a[100],i,j,w[100],c[100],t[100],b[100],n,total_tat=0,total_wt=0;
    char p[100];
    cout<<"Enter number of process:";
    cin>>n;
    cout<<"enter process names:\n";
    for(i=0;i<n;i++){
        cin>>p[i];
    }
    for(i=0;i<n;i++){
        cout<<"Enter brust time of "<< p[i]<<" ";
        cin>>b[i];
    }
    for(i=0;i<n;i++){
        cout<<"Enter arrival time of "<< p[i]<<" ";
        cin>>a[i];
    }
    for(i=0;i<n;i++)
    {
        for(j=0;j<n-i;j++)
        if(a[j+1]<a[j])
        {
            a[j] = a[j+1]+a[j]-(a[j+1]=a[j]);
            b[j] = b[j+1]+b[j]-(b[j+1]=b[j]);
            p[j] = p[j+1]+p[j]-(p[j+1]=p[j]);   
        }
    }
    for(i=0;i<n;i++){
        if(a[i]==a[i+1]){
            if(b[i]>b[i+1]){
                a[j] = a[j+1]+a[j]-(a[j+1]=a[j]);
                p[j] = p[j+1]+p[j]-(p[j+1]=p[j]);  
            }
        }
    }
    c[0]=b[0];
    t[0] = c[0]-a[0];
    w[0]=t[0]-b[0];
    for(i=0;i<n;i++){
    if(c[i-1]>a[i]){
        for(i=0;i<n;i++)
        {
            for(j=0;j<n-i;j++)
                if(b[j+1]<b[j])
            {
                a[j] = a[j+1]+a[j]-(a[j+1]=a[j]);
                b[j] = b[j+1]+b[j]-(b[j+1]=b[j]);
                p[j] = p[j+1]+p[j]-(p[j+1]=p[j]);   
            }
        }
        for(i=1;i<n;i++){
            c[i]=c[i-1]+b[i];
            t[i] = c[i]-a[i];
            w[i]=t[i]-b[i];
        }
    }
    else{
        c[i]=a[i]+b[i];
        t[i] = c[i]-a[i];
        w[i]=t[i]-b[i];
        }
    };
    cout<<"Process"<<setw(10)<<"AT"<<setw(10)<<"BT"<<setw(10)<<"CT"<<setw(10)<<"TAT"<<setw(10)<<"WT"<<endl;
	cout<<string(70,'-')<<endl;
	for(i=0;i<n;i++)
	{
		cout<<"P"<<p[i]<<setw(15)<<a[i]<<setw(10)<<b[i]<<setw(10)<<c[i]<<setw(10)<<t[i]<<setw(10)<<w[i]<<endl;
        total_tat += t[i];
        total_wt += w[i]; 
	}
    cout<<"GANTT CHART is:: \n";
    for(i=0;i<n;i++){
        cout<<"P"<<p[i]<<"->";
    }
    cout<<"\nTotal TURN AROUND TIME is "<<total_tat<<" and average is "<<(float)total_tat/n;
    cout<<"\nTotal WAITING TIME is "<<total_wt<<" and average is "<<(float)total_wt/n;
    return 0;
}