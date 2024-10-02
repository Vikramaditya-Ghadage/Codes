// Online C++ compiler to run C++ program online
#include<bits/stdc++.h>
using namespace std;
// Time-Complixity: O(N) it's a Linear
void removeDuplicates(vector<int> &nums)
{
    unordered_map<int,int> mp;
    vector<int> tmp;
    for(int i=0;i<nums.size();i++)
    {
        if(mp.find(nums[i])==mp.end())
        {
            tmp.emplace_back(nums[i]);
            mp[nums[i]]++;
        }
    }
    for(auto i:tmp)
    cout<<i<<" ";

}

// Time-Complixity: O(N) it's a Linear
void removeDuplicatesUsingSet(vector<int> &nums)
{
    unordered_set<int> st;
    for(auto no:nums)
    st.insert(no);
    
    for(auto i:st)
    cout<<i<<" ";

}
int main()
{
    vector<int> nums={1,0,2,1,2,3,3,0,4,5,5};
   // removeDuplicates(nums);
    removeDuplicatesUsingSet(nums);
}
