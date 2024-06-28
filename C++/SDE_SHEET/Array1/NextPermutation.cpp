#include<bits/stdc++.h>
using namespace std;
// Time-Complixity: O(N) it's Linear
void nextPermutaion(vector<int> &nums)
{
    int n=nums.size();
    int k;
    for(k=n-2;k>=0;k--)
    {
        if(nums[k]<nums[k+1])
        break;
    }
    if(k<0)
    {
        reverse(nums.begin(),nums.end());
    }
    else
    {
        int ub=n-1;
        for(;ub>k;ub--)
        {
            if(nums[k]<nums[ub])
            break;
        }
        swap(nums[k],nums[ub]);
        reverse(nums.begin()+k+1,nums.end());
    }
}

int main()
{
    vector<int> nums={1,2,3,5,4};
    nextPermutaion(nums);
    for(int i:nums)cout<<i;
}