#include<bits/stdc++.h>
using namespace std;
// Time Complexity: O(2^n) - Exponential time
void printSubsequence(vector<int> nums,vector<int> ds,vector<vector<int>> &ans,int index)
{
    if(index>=nums.size())
    {
        ans.emplace_back(ds);
        return;
    }
    //include
    ds.emplace_back(nums[index]);
    printSubsequence(nums,ds,ans,index+1);
    ds.pop_back();
 
    //exclude
    printSubsequence(nums,ds,ans,index+1);
}

int main()
{
    vector<int> nums={1,2,3};
    vector<vector<int>> ans;
    vector<int> ds;
    printSubsequence(nums,ds,ans,0);
    for(int i=0;i<ans.size();i++)
    {
        cout<<endl;
        for(int j=0;j<ans[i].size();j++)
        {
            cout<<ans[i][j]<<" ";
        }
    }

}