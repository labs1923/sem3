#include<iostream>
#include<stdlib.h>
using namespace std;
struct node
{
    int data;
    struct node *right,*left;
};
struct node *getNewNode(int val)
{   struct node *newNode =(struct node *) malloc(sizeof(struct node));
    newNode->data = val;
    newNode->left = NULL;
    newNode->right = NULL;
    return newNode;
}
struct node *insert(struct node *root, int val)
 {
    if(root == NULL) 
    return getNewNode(val);
    if(root->data < val)
     root->right = insert(root->right,val); 
    else if(root->data > val) 
    root->left = insert(root->left,val); 
    return root;
} 
struct node* search(struct node *root,int key) 
{
 if(root==NULL)
 {
    return NULL;
 }
 else if(root->data==key)
 {
 return root;
 }
 else if(root->data<key)
 {
 return search(root->right,key);
 }
 else 
 {
 return search(root->left,key);
 }
}
struct node* findmin(struct node* root)
{
    while(root->left!=NULL)
    {
        root=root->left;
    }
    return root;
}
struct node* deletion(struct node * root,int data)
{
    if(root==NULL)
    {
        return root;
    }
    else if(data< root->data)
    {
        root->left=deletion(root->left,data);
    }
    else if(data>root->data)
    {
        root->right=deletion(root->right,data);
    }
    else
    {
        //case 1: no child
        if(root->left==NULL&&root->right==NULL)
        {
            root=NULL;  
            cout<<"\nelement deleted!!";  
        }
        //case 2: one child
        else if(root->left==NULL)
        {
            struct node* temp;
           temp =root;
            root=root->right;
            cout<<"\nelement deleted!!";
        }
        else if(root->right==NULL)
        {
            struct node* temp;
            temp=root;
            root=root->left;
            cout<<"\nelement deleted!!";
        }
        //case 3: 2 children
        else{
            struct node* temp=findmin(root->right);
            root->data=temp->data;
            root->right=deletion(root->right,temp->data);
            cout<<"\nelement deleted!!";
        }
    }
    return root;   
}
void inorder(struct node *root) {
    if(root == NULL) return;
    inorder(root->left);
    cout<<root->data<<" ";
    inorder(root->right);
}
int main()
{
    int number,element;
    struct node *temp,*root=NULL;
    cout<<"1.Inserting numbers into BST\n2.Deleting numbers from BST\n3.Searching a number in BST\n4.Displaying BST in inorder form\n5.Exit from BST\n";
    while(1)
    {
        cout<<"\nEnter required operation on BST : ";
        cin>>number;
        switch(number)
        {
            case 1 :
            cout<<"\nenter the element to be inserted: ";
            cin>>element;
            root=insert(root,element);
            break;
         case 2:
            cout<<"\nenter the element to be deleted:  ";
            cin>>element;
            deletion(root,element);
            break;
            case 3:
            cout<<"\nenter the element to be in searched: ";
            cin>>element;
           temp=search(root,element);
           if(temp==NULL)
           {
            cout<<"\nElement "<<element<<" is not Found!!";
           }
           else
           {
            cout<<"\nElement "<<element<<" is Found!!";
           }
            break;
            case 4:
            cout<<"\nBinary Search Tree is :\n";
            inorder(root);
            break;
            case 5:
            exit(1);
        }
    }
    return 0;
}
    