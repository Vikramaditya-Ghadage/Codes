#include<bits/stdc++.h>
using namespace std;
struct ListNode {
      int data;
      ListNode *next;
      ListNode() : data(0), next(NULL) {}
      ListNode(int x) : data(x), next(NULL) {}
      ListNode(int x, ListNode *next) : data(x), next(next) {}
}*head=NULL,*current=NULL;
void insert(int data)
{
    ListNode *new_node=new ListNode(data);
    if(head==NULL)
    {  
        head=new_node;
        current=new_node;
    }
    else
    {
        current->next=new_node;
        current=new_node;
    }
}
void reverse()
{
    ListNode *previous=NULL;
    ListNode *current=head;
    ListNode *next_pointer=head;


    while(current)
    {
        next_pointer=current->next;
        current->next=previous;
        previous=current;
        current=next_pointer;
    }

    head=previous;  
}

void reversePrint(ListNode *temp)
{
    if(temp==NULL)
    return;

    reversePrint(temp->next); 
    cout<<temp->data<<"->";   
}

void print()
{
    ListNode *temp=head;
    cout<<endl<<"List is:";  
    while(temp)
    {
        cout<<temp->data<<"->";
        temp=temp->next;
    }
    
}

void findMiddle()
{
    ListNode* slow=head;
    ListNode* fast=head;

    while(fast!=NULL && fast->next!=NULL)
    {
        slow=slow->next;
        fast=fast->next->next;
    }
    cout<<endl<<slow->data;
}

int main()
{
    for(int i=1;i<=5;i++)
    {
        insert(i);
    }

    print();
    reverse();
    print();
    findMiddle();
    // cout<<endl;
    // reversePrint(head);
}