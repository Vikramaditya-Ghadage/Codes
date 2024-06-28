#include<bits/stdc++.h>
using namespace std;
// Time-Complixity: O(N) it's a Linear
int findMaxSum(vector<int> nums,int n)
{
    int current_max=nums[0];
    int all_time_max=nums[0];
    for(int i=1;i<n;i++)
    {
        current_max=max(nums[i],(current_max+nums[i]));
        all_time_max=max(current_max,all_time_max);
    }
    return all_time_max;
}

// Time-Complixity: O(N^3)
int bruteForceMaxSum(vector<int> &nums,int n)
{
    int max=INT_MIN;
    for(int i=0;i<n;i++)
    {
        for(int j=i+1;j<n;j++)
        {
            int sum=0;
            for(int k=i;k<=j;k++)
            {
                sum+=nums[k];
            }
            if(max<sum)
            max=sum;
        }
    }    
    return max;
}



int main()
{
    vector<int> nums={-2, -3, 4, -1, -2, 1, 5, -3};
    // vector<int> nums={-2,1,-3,4,-1,2,1,-5,4};
    cout<<endl<<"Max is:"<<bruteForceMaxSum(nums,nums.size());
    cout<<"Max is:"<<findMaxSum(nums,nums.size());
}
