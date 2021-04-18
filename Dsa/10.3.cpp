#include<iostream>
using namespace std;
struct node {
    int data;
    struct node *right;
    struct node *left;
};
struct node *start=NULL;
int insert();
int search();
void inorder(struct node *);
void del(int data);
int min(struct node *);
int main(){
    int c=-1,d,data;
    while(1){
       cout<<"\n0.exit\n1.insert\n2.display\n3.search\n4.delete"<<endl;
       cin>>c;
       switch(c){
           case 1: insert();
                   break;
           case 2: inorder(start);
                   break;
           case 3: d = search();
                   if(d!=-1){ cout<<"element found at "<<d<<endl;}
                   else {cout<<"not found"<<endl;}
                   break;
           case 4: cin>>data;
                  del(data);
                  break;
           case 0: exit(0);
       }
    }
}

int insert(){
    int data;
    cin>>data;
    struct node *t,*temp;
    t = (struct node *)malloc(sizeof(struct node ));
    t->data = data;
    t->left = NULL;
    t->right = NULL;
    if(start==NULL){
        start=t;
        return 0;
    }
    temp = start;
    for(;;){
        if(t->data<temp->data){
           if(temp->left == NULL){
               temp->left = t;
               return 0;
           }
           else{
               temp=temp->left;
           }
        }
        else{
            if(temp->right == NULL){
                temp->right = t;
                return 0;
            }
            else{
                temp=temp->right;
            }
        }
    }
}

 void inorder(struct node *ptr){
     if(ptr->left!=NULL)
     inorder(ptr->left);
     cout<<ptr->data<<" ";
     if(ptr->right!=NULL)
     inorder(ptr->right);
 }

int search(){
    int data,d=0;
    cin>>data;
    struct node *temp;
    temp = start;
    while(1){
    if(temp->data == data){
        return d;
    }
    else if(data>temp->data){
        if(temp->right==NULL&&temp->left==NULL){
            return -1;
        }
        else{
            temp = temp->right;
            d++;
        }
    }
    else{
        if(temp->right==NULL && temp->left == NULL){
            return -1;
        }
        else {
            temp = temp->left;
            d++;
        }
    }
    }
}

void del(int data){
    int r;
    struct node *temp,*pt;
    temp = start;
    while(1){
    if(temp->data == data){
        if(temp->left==NULL&&temp->right==NULL){
            if(pt->data>temp->data){
                pt->left=NULL;
            }
            else
            {
                pt->right = NULL;
            }
            
            free(temp);
            return;
        }
        else if(temp->left==NULL||temp->right==NULL){
            if(temp->left==NULL){
                if(data>pt->data)
                pt->right = temp->right;
                else
                pt->left = temp->right;     
            }
            else{
                if(data>pt->data)
                pt->right = temp->left;
                else
                pt->left = temp->left;
            }
            return ;
        }
        else{
               r = min(temp->right);
               del(r);
               temp->data = r;
               return ;
        }
    }
    else if(data>temp->data){
        if(temp->right==NULL&&temp->left==NULL){
            return ;
        }
        else{
            pt = temp;
            temp = temp->right;
        }
    }
    else{
        if(temp->right==NULL && temp->left == NULL){
            return ;
        }
        else {
            pt = temp;
            temp = temp->left;
        }
    }
    
    }
}
int min(struct node *ptr){
    while(ptr->left!=NULL){
        ptr = ptr->left;
    }
    return ptr->data;

}
