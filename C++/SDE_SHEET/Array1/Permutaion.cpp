#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
// Time-Complixity: O(N!) it's factorial
void permutation(vector<int> nums,vector<vector<int>> &ans,int index)
{
    if(index>=nums.size())
    {
        ans.emplace_back(nums);
        return;
    }

    for(int j=index;j<nums.size();j++)
    {
        swap(nums[j],nums[index]);
        permutation(nums,ans,index+1);
        swap(nums[j],nums[index]);
    }
}
// Time-Complixity: O(N!) it's factorial
void permutation2(vector<int> nums,vector<vector<int>> &ans)
{
    do
    {    
        ans.emplace_back(nums);    
    }while(next_permutation(nums.begin(),nums.end()));

}

int main()
{
    vector<int> nums={1,2,3,4,5};
    vector<int> temp=nums;
    vector<vector<int>> ans;
    int index=0;
    permutation(nums,ans,0);
    // permutation2(nums,ans);
    int cnt=0;
    for(int i=0;i<ans.size();i++)
    {
        cout<<endl;
        cnt++;
        for(int j=0;j<ans[i].size();j++)
        {
            cout<<ans[i][j];
            
        }
    }
    cout<<endl<<"Total permutaions are:"<<cnt;
}