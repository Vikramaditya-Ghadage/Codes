#include<bits/stdc++.h>
using namespace std;
// Time-Complixity: O(N) it's Linear
void findTwoSum(vector<int> nums,int target)
{
    int n=nums.size();
    unordered_map<int,int> mp;
    for(int i=0;i<n;i++)
    {
        int no=nums[i];
        if(mp.find(target-no)!=mp.end())
        {
            cout<<(target-no)<<"+"<<no<<"="<<target<<endl;
        }
        mp[no]=i;      
    }

}
int main()
{
    vector<int> nums={3,1,5,2,4,6};
    int target=6;
    findTwoSum(nums,target);
}


