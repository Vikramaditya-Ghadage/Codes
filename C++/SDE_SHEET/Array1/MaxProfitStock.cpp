#include<bits/stdc++.h>
using namespace std;
// Time-Complixity: O(N) it's a Linear
int maxProfit(vector<int> nums,int n)
{
    int min_element=INT_MAX;
    int max_profit=INT_MIN;
    for(int i=0;i<n;i++)
    {   
        min_element=min(min_element,nums[i]);
        max_profit=max(max_profit,(nums[i]-min_element));
    }
    return max_profit;
}

// Time-Complixity: O(N^2)
int bruteForceMaxProfit(vector<int> &nums,int n)
{
    int max_sum=INT_MIN;
    for(int i=0;i<n;i++)
    {
        for(int j=i+1;j<n;j++)
        {
            if(nums[i]<nums[j])
            {
                int sum=nums[j]-nums[i];
                max_sum=max(max_sum,sum);
            }
        }
    }    
    return max_sum;
}

int main()
{
    vector<int> nums={2,1,5,4,6,8};
    cout<<"Max Profit is:"<<maxProfit(nums,nums.size());
    cout<<endl<<"Max Profit is:"<<bruteForceMaxProfit(nums,nums.size());
}