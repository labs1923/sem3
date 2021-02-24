#include<iostream>
using namespace std;
struct node {
    int data;
    struct node *left;
    struct node *right;
};
struct node *start = NULL;
int insert(int data);
void preorder(struct node *temp);
void inorder(struct node *temp);
void postorder(struct node *temp);
int main(){
    int data,i,n,c=-1,r;
    cout<<"enter the no. of elements"<<endl;
    cin>>n;
    cout<<"enter the elements"<<endl;
    for(i=0;i<n;i++){
    cin>>data;
    insert(data);
    }
    while(c!=0){
        cout<<"0.Exit\n1.Inserting\n2.Display\nenter your choice"<<endl;
        cin>>c;
            if(c==1){
            cout<<"enter the data"<<endl;
            cin>>data;
            insert(data);
            }
            else if(c==2){
                    cout<<"Pre order  : ";
                    preorder(start);
                    cout<<endl;
                    cout<<"Post order : ";
                    postorder(start);
                    cout<<endl;
                    cout<<"In order   : ";
                    inorder(start);
                    cout<<endl;                
            }
            else if(c!=0)
            cout<<"enter correct input"<<endl;
        
    }
    free(start);
    return 0;
    
}
int insert(int data)
{
  struct node *temp,*t;
  t = (struct node*)malloc(sizeof(struct node));
  t->data = data;
  t->right = NULL;
  t->left = NULL;
  if(start == NULL)
  {
      start=t;
      return 0;
  }
  temp = start;
  for(;;){
      if(t->data<temp->data)
      {
        if(temp->left == NULL)
        {
           temp->left = t;
           return 0 ;
        }
        else
        {
           temp = temp->left;  
        }
      }
      else
      {
        if(temp->right == NULL)
        {
           temp->right = t; 
           return 0;
        }
        else
        {
           temp = temp->right;  
        }  
      }
  }
}
void preorder(struct node *temp)
{
    cout<<temp->data<<" ";
    if(temp->left!=NULL)
    preorder(temp->left);
    if(temp->right!=NULL)
    preorder(temp->right);
}
void inorder(struct node *temp)
{
    if(temp->left!=NULL)
    inorder(temp->left);
    cout<<temp->data<<" ";
    if(temp->right!=NULL)
    inorder(temp->right);
}
void postorder(struct node *temp)
{
    if(temp->left!=NULL)
    postorder(temp->left);
    if(temp->right!=NULL)
    postorder(temp->right);
    cout<<temp->data<<" ";
}