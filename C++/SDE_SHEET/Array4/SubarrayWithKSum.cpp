#include<bits/stdc++.h>
using namespace std;

// Time-Complixity: O(N) it's Linear
int findCnt(vector<int> nums,int k)
{
    unordered_map<int,int> mp;
    int len=0;
    int sum=0;
    
    for(int i=0;i<nums.size();i++)
    {
        sum+=nums[i];
        if(sum==k)
        {
            len=i+1;
        }
        else if(mp.find(sum-k)!=mp.end())
        {
            len=max(len,(i-mp.at(sum-k)));
        }
        if(mp.find(sum)==mp.end())
            mp[sum]=i;

    }

    return len;
}

int main()
{
    vector<int> nums={9, -3, 3, -1, 6, -5};
    cout<<"Maximum length of Subarray with k sum is:"<<findCnt(nums,8);
}