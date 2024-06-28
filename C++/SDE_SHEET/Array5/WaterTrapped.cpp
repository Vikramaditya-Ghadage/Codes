#include<bits/stdc++.h>
using namespace std;

// Time-Complixity: O(N^2) it's a Quadratic
int waterTrappedBruteForce(vector<int> &nums)
{
    int ans=0;
    int n=nums.size();
    for(int i=0;i<n;i++)
    {
        int leftMax=0,rightMax=0;
        int j=i;
        while(j>=0)
        {
            leftMax=max(leftMax,nums[j]);
            j--;
        }
        j=i;
        while(j<n)
        {
            rightMax=max(rightMax,nums[j]);
            j++;
        }
        ans+=min(leftMax,rightMax)-nums[i];
    }
    return ans;
}

// Time-Complixity: O(N) it's a Linear
int waterTrapped(vector<int> &nums)
{
    int ans=0;
    int left=0,right=nums.size()-1;
    int leftMax=0,rightMax=0;
    while(left<=right)
    {
        if(nums[left]<=nums[right])
        {
            if(nums[left]>=leftMax)
            leftMax=nums[left];
            else
            ans+=leftMax-nums[left];
            left++;
        }
        else
        {
            if(nums[right]>=rightMax)
            rightMax=nums[right];
            else
            ans+=rightMax-nums[right];
            right--;
        }
    }
    return ans;
}

int main()
{
    vector<int> nums={0,1,0,2,1,0,1,3,2,1,2,1};
    // vector<int> nums={4,2,0,3,2,5};
    cout<<"Water trapped:"<<waterTrappedBruteForce(nums)<<endl;
    cout<<"Water trapped:"<<waterTrapped(nums)<<endl;
}