#include<bits/stdc++.h>
using namespace std;
void removeTripplet(vector<int> &nums)
{
    stack<pair<int,int>> st;
    for(int i=0;i<nums.size()-1;i++)
    {
        if(!st.empty())
        cout<<nums[i]<<"->"<<st.top().first<<":"<<st.top().second<<"\t";

        if(st.empty() || st.top().first!=nums[i])
        st.push({nums[i],1});
        else
        {
            int cnt=st.top().second;
            st.push({nums[i],cnt+1});
        }
        if(!st.empty())
        cout<<nums[i]<<"->"<<st.top().first<<":"<<st.top().second<<endl<<endl;
        
        if(!st.empty() && st.top().second==3)
        st.pop();
    }

     while(!st.empty())
    {
       // cout<<st.top().first;
       cout<<endl<<"Current Stack:"<<endl;
        cout<<st.top().first<<"\t"<<st.top().second;
        st.pop();
    }

  
    

}
int main()
{
    vector<int> nums={0,1, 1, 1, 2, 2, 3, 3, 3, 2, 0, 0, 4, 3};
    removeTripplet(nums);
}