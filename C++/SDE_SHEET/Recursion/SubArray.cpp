#include<iostream>
#include<vector>
using namespace std;
// Time Complexity: O(2^n) - Exponential time
void printSubArray(vector<int> nums,vector<int> ds,vector<vector<int>> &ans,int start,int end)
{
    if(end>=nums.size())
    {
        return;
    }
    if(start>end)
    {
        printSubArray(nums,ds,ans,0,end+1);
    }
    else
    {
        for(int i=start;i<=end;i++)
        ds.emplace_back(nums[i]);

        ans.emplace_back(ds);
        ds.clear();
        printSubArray(nums,ds,ans,start+1,end);
    }
    
}
// Time Complexity: O(n^3) - Cubic time
void printSubArray2(vector<int> arr,int n)
{
    for(int i=0;i<n;i++)
    {
        for(int j=i;j<n;j++)
        {
            cout<<endl;
            for(int k=i;k<=j;k++)
            {
                cout<<arr[k];
            }
        }
    }
}

int main()
{
    vector<int> nums={1,2,3};
    vector<int> output;
    vector<vector<int>> ans;
    int start=0,end=0;
    printSubArray(nums,output,ans,0,0);
    printSubArray2(nums,nums.size());

    for(int i=0;i<ans.size();i++)
    {
        cout<<endl;
        for(int j=0;j<ans[i].size();j++)
        cout<<ans[i][j];

    }
    // printSubArray2(v,v.size());
}
