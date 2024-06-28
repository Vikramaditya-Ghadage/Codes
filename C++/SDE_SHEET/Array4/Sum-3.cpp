#include<bits/stdc++.h>
using namespace std;
// Time-Complixity: O(N^2) it's quadratic
void findThreeSum(vector<int> nums,int target)
{
	sort(nums.begin(),nums.end());
	int n=nums.size();
	for(int i=0;i<n;i++)
	{
		int lb=i+1;
        int ub=n-1;
        while(lb<ub)
        {
            int sum=nums[i]+nums[lb]+nums[ub];
            if(sum==target)
            {
                cout<<nums[i]<<"+"<<nums[lb]<<"+"<<nums[ub]<<"="<<target<<endl;
                lb++;
                ub--;             
            }
            if(sum>target)
            ub--;

            if(sum<target)
            lb++;
        }	
	}
}

int main()
{
    vector<int> nums={1,2,3,4,5,6};
    int target=8;
    findThreeSum(nums,target);
}