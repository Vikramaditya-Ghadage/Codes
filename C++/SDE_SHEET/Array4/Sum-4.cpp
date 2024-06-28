#include<bits/stdc++.h>
using namespace std;
// Time-Complixity: O(N^3) it's qubic
void findFourSum(vector<int> nums,int target)
{
	sort(nums.begin(),nums.end());
	int n=nums.size();
	for(int i=0;i<n;i++)
	{
        for(int j=i+1;j<n;j++)
        {        
            int lb=j+1;
            int ub=n-1;
            while(lb<ub)
            {
                int sum=nums[i]+nums[j]+nums[lb]+nums[ub];
                if(sum==target)
                {
                    cout<<nums[i]<<"+"<<nums[j]<<"+"<<nums[lb]<<"+"<<nums[ub]<<"="<<target<<endl;
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
}

int main()
{
    vector<int> nums={1,2,3,4,5,6,7,8,9,10};
    int target=12;
    findFourSum(nums,target);
}