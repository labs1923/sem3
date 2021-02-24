#include<iostream>

#include<string.h>

#define max 100

using namespace std;

int stack[max];

int top=-1;

void evaluatepostfix(char s[100],int n)

{

    int i,temp1,temp2,temp;

    for(i=0;i<n;i++)

    {

        if(s[i]=='+'||s[i]=='-'||s[i]=='*'||s[i]=='/')

        {

            if(top>=1)

            {

            temp1=stack[top];

            top--;

            temp2=stack[top];

            top--;

            switch(s[i])

            {

                case '+':

                      temp=temp1+temp2;

                      break;

                 case '-':

                      temp=temp2-temp1;

                      break;

                  case '*':

                      temp=temp2*temp1;

                      break;

                  case '/':

                       temp=temp2/temp1;

                       break;

            }

            top++;

            stack[top]=temp;

            }

            else

            {

                cout<<"under flow will occur";

            }

        }

        else

        {

          if(top!=max)

          {

            top++;

            stack[top]=s[i]-48;

        } 

        else

        {

            cout<<"over flow of stack!";

        }

        }

    }

}

int main()

{

    char s[100];

    int n;

    cout<<"enter postfix expression: ";

    cin>>s;

    n=strlen(s);

    evaluatepostfix(s,n);

    cout<<"result is: "<<stack[top];

}
