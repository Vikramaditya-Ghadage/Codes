#include<iostream>
#include<queue>
using namespace std;
int main()
{
    queue<int> qt;
    for(int i=1;i<=5;i++)
    qt.emplace(i);
    
    while(!qt.empty())
    {
        cout<<qt.front()<<endl;
        // cout<<qt.back()<<endl;
        qt.pop();
    }
}
