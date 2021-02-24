#include <iostream>
using namespace std;
struct node {
    int data;
    struct node *next;
    struct node *prev;
};
struct node *start = NULL;
int n;
int insert_end(int data);
int insert_begin(int data);
int insert_after(int data);
int delete_begin();
int delete_at();
int delete_end();
void display();
void reverse();
int main()
{
    int c=-1,data,ch,r;
    while(c!=0){
        cout<<"0.exit\n1.Insertion\n2.Deletion\n3.Display\n4.Reverse the list"<<endl;
        cin>>c;
        switch(c){
            case 1 : cout<<"1.Insertion at Begining\n2.Insertion after an element\n3.Insertion at End"<<endl;
                     cin>>ch;
                     cout<<"enter the data"<<endl;
                     cin>>data;
                     if(ch==1)
                     insert_begin(data);
                     else if(ch==2){
                     r = insert_after(data);
                     if(r==-1) cout<<"search element is not in the list"<<endl;}
                     else if(ch==3)
                     insert_end(data);
                     break;
            case 2 : if(start==NULL)
                     cout<<"linked list is empty"<<endl;
                     else if(start->next==NULL)
                      start = NULL;
                     else{
                     cout<<"1.Deletion at Begining\n2.Deletion of a specific element\n3.Deletion at End"<<endl;
                     cin>>ch;
                     if(ch==1)
                     delete_begin();
                     else if(ch==2){
                     r = delete_at();
                     if(r==-1) cout<<"search element is not in the list"<<endl;}
                     else if(ch==3)
                     delete_end();
                     }
                     break;
            case 3 : if(start==NULL)
                     cout<<"linked list is empty"<<endl;
                     else
                     display();
                     break;
            case 4 : if(start==NULL)
                     cout<<"linked list is empty"<<endl;
                     else
                     reverse();
                     break;
            default : if(c!=0) cout<<"enter correct choice"<<endl;         
        }
    }
  return 0;
}
int insert_begin(int data)
{
    struct node *t;
    t = (struct node*)malloc(sizeof(struct node));
    t->data=data;
    t->next = start;
    t->prev = NULL;
    start = t;
    return 0;
}
int insert_after(int data)
{
    int element;
    if(start!=NULL){
    cout<<"enter the element you want to insert the new data after it"<<endl;
    cin>>element;
    struct node *temp,*t;
    t = (struct node*)malloc(sizeof(struct node));
    t->data=data;
    temp = start;
    while(element!=temp->data){
        if(temp->next == NULL)
        return -1;
    temp = temp->next;
    }
    t->prev = temp;
    t->next = temp->next;
    temp->next = t;
    temp = temp->next;
    t = t->next;
    t->prev = temp;
    }
    else
    insert_begin(data);
}
int insert_end(int data)
{
    struct node *temp,*t;
    temp = start;
    t = (struct node*)malloc(sizeof(struct node));
    t->data=data;
    if(start==NULL){
        start=t;
        start->next = NULL;
        return 0;
    }
     while (temp->next != NULL)
    temp = temp->next;
    t->prev = temp;
    temp->next = t;
    t->next   = NULL;
    return 0;
}
int delete_begin(){
    start = start->next;
    start->prev = NULL;
}
int delete_at(){
    int element;
    cout<<"enter the element you want to delete."<<endl;
    cin>>element;
    struct node *temp,*t;
    temp = start;
    if(start->data==element)
    {
        start = start->next;
        start->prev = NULL;
        return 0;
    }
    while(element!=temp->data){
        if(temp->next == NULL)
        return -1;
    t = temp;    
    temp = temp->next;
    }
    t->next = temp->next;
    temp = temp->next;
    temp->prev = t;
}
int delete_end()
{
    struct node *temp,*t;
    temp=start;
    while(temp->next!=NULL){
    t = temp;
    temp = temp->next;
    }
    t->next = NULL;
}
void display(){
    struct node *temp;
    temp = start;
    while(temp->next != NULL){
    cout<<temp->data<<" ";    
    temp = temp->next;
    }
    cout<<temp->data<<endl;
}
void reverse(){
    struct node *temp,*r,*t;
    temp=start;
    while(temp->next != NULL){
    r = temp;
    temp = temp->next;
    t = r->prev;
    r->prev = r->next;
    r->next = t;
    }
    r = temp;
    t = r->prev;
    r->prev = r->next;
    r->next = t;
    start=r;
    cout<<"list after reversing"<<endl;
    display();
}