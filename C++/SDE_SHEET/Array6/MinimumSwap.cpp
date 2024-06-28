#include<bits/stdc++.h>
using namespace std;
void swap(vector<int>& nums, int i, int j)
{
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
}

int minimumSwap(vector<int> nums)
{
    int ans=0;
    unordered_map<int,int> mp;

    vector<int> tmp=nums;
    sort(tmp.begin(),tmp.end());
    for(int i=0;i<tmp.size();i++)
    mp[tmp[i]]=i;

    for(int i=0;i<nums.size();i++)
    {
        if(nums[i]!=tmp[i])
        {
            ans++;
           // cout<<"position:"<<mp.at(tmp[i])<<" "<<mp.at(nums[i])<<"\t";
            swap(nums,mp.at(tmp[i]),mp.at(nums[i]));
           // cout<<nums[i]<<" "<<tmp[i]<<endl;
            i--;
        }
    }
    return ans;
}
int main()
{
     vector<int> nums={1,3,2,4};
    // vector<int> nums={101, 758, 315, 730, 472, 619, 460, 479};
    cout<<"Minimum Swap required:"<<minimumSwap(nums);
}