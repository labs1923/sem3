import numpy as np
print("hi")
#include<stdio.h>
#include<stdlib.h>
struct node
{
    int data;
    struct node *next;
}*head;
head=NULL;
void insert()
{
    struct node *newnode,*temp;
    int item;
    newnode=(struct node*)malloc(sizeof(struct node));
    printf("enter value");
    scanf("%d",&item);
    newnode->data=item;
    newnode->next=NULL;
    if(head==NULL)
    {
        temp=head;
    head=newnode;
    }
    else 
    {
        temp->next=newnode;
        temp=newnode;
    }
}
void display()
{
    struct node *ptr;
    ptr=head;
    if(ptr==NULL)
    printf("nothing to print");
    else
{
    while(ptr!=NULL)
    {
        printf("\n%d",ptr->data);
        ptr=ptr->next;
   }
      }
}
int main()
{
    insert();
    insert();
    display();
}