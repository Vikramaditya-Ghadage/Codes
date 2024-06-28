#include<iostream>
#include<queue>
#include<vector>
#include <cstdlib>
using namespace std;
int main()
{
    priority_queue<int> pqt; // Time complixity in O(1) in case of Search and O(log n) in case of insertion,updation and deltion) it use BST
    for(int i=1;i<=5;i++) 
    pqt.push(i);

    while(!pqt.empty())
    {
        cout<<pqt.top()<<endl;
        pqt.pop();
    }
    cout<<"**********************"<<endl;
    priority_queue<int,vector<int>,greater<int>> min;

    for(int i=8;i>=0;i--)
    {
        min.push(i);
    }

    while(!min.empty())
    {
        cout<<min.top()<<endl;
        min.pop();
    }

}
