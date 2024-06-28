#include <bits/stdc++.h>
using namespace std;

int singleNonDuplicate(vector<int>& nums) 
{
    int n=nums.size();
    int lb=0,ub=n-1;
    if (n == 1) return nums[0];
    if (nums[0] != nums[1]) return nums[0];
    if (nums[n - 1] != nums[n - 2]) return nums[n - 1];

    while(lb<=ub)
    {
        int mid=(lb+ub)/2;
        if((nums[mid]!=nums[mid-1]) && (nums[mid]!=nums[mid+1]))
        return nums[mid];
        else if((mid%2==1 && nums[mid]==nums[mid-1]) || (mid%2==0 && nums[mid]==nums[mid+1]) )
        lb=mid+1;
        else 
        ub=mid-1;

    }
    return -1;
}
int main()
{
    vector<int> nums = {1, 1, 2, 2, 3, 3, 4,4, 5, 5, 6};
    int ans = singleNonDuplicate(nums);
    cout << "The single element is: " << ans << "\n";
    return 0;
}