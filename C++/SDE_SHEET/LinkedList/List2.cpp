#include<bits/stdc++.h>
using namespace std;
struct ListNode
{
    int data;
    ListNode* next;
    ListNode(int x): data(x), next(NULL){}


};

// Time-Complixity: O(N) it's linear
void findMiddle(ListNode* head)
{
    ListNode* slow=head;
    ListNode* fast=head;

    while(fast!=NULL && fast->next!=NULL)
    {
        slow=slow->next;
        fast=fast->next->next;
    }
    cout<<slow->data<<endl;
}

// Time-Complixity: O(N) it's linear
bool detectCycle(ListNode* head)
{
    ListNode* slow=head;
    ListNode* fast=head;
    while(fast && fast->next)
    {
        slow=slow->next;
        fast=fast->next->next;

        if(slow==fast)
        return true;
    }
    return false;
}

void print(ListNode* head)
{
    ListNode* temp=head;
    while(temp!=NULL)
    {
        cout<<temp->data<<"->";
        temp=temp->next;
    }
    cout<<endl;
}

// Time-Complixity: O(N) it's linear
bool isPalindrome(ListNode* head)
{
    ListNode* temp=head;
    stack<int> st;
    while(temp)
    {
        st.push(temp->data);
        temp=temp->next;
    }

    temp=head;
    while(temp)
    {
        if(temp->data!=st.top())
        return false;

        st.pop();
        temp=temp->next;
    }
    return true;
}

int main()
{
    ListNode* head = new ListNode(1);
    head->next = new ListNode(2);
    head->next->next = new ListNode(3);
    head->next->next->next = new ListNode(2);
    head->next->next->next->next = new ListNode(1);
    //head->next->next->next->next->next = new ListNode(6);

    // print(head);
    // findMiddle(head);
    // if(detectCycle(head)) {
    //     cout << "Loop detected in the linked list." << endl;
    // } else {
    //     cout << "No loop detected in the linked list." << endl;
    // }

    if(isPalindrome(head)) {
        cout<<"Palindrome" << endl;
    } else {
        cout<<"Not Palindrome"<<endl;
    }

}