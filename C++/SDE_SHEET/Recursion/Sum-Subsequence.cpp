#include<bits/stdc++.h>
using namespace std;
// Time Complexity: O(2^t * k) where t is the target, k is the average length
void sumSubSequence(vector<int> nums,vector<int> ds,int target,int index)
{
    if(index>=nums.size())
    {
        if(target==0)
        {
            for(int i=0;i<ds.size();i++)
            {
                cout<<ds[i];
                if(i==ds.size()-1)
                cout<<"="<<accumulate(ds.begin(),ds.end(),0)<<endl;
                else
                cout<<"+";
            }           
        }
        return;
    }

    //include
    ds.emplace_back(nums[index]);
    sumSubSequence(nums,ds,(target-nums[index]),index+1);
    ds.pop_back();

    //exlude
    sumSubSequence(nums,ds,target,index+1);
}

void sumSubSequenceRepeativeNumber(vector<int> nums,vector<int> ds,int target,int index)
{
    if(index>=nums.size())
    {
        if(target==0)
        {
            for(int i=0;i<ds.size();i++)
            {
                cout<<ds[i];
                if(i==ds.size()-1)
                cout<<"="<<accumulate(ds.begin(),ds.end(),0)<<endl;
                else
                cout<<"+";
            }           
        }
        return;
    }
    if(nums[index]<=target)
    {
        //include
        ds.emplace_back(nums[index]);
        sumSubSequenceRepeativeNumber(nums,ds,(target-nums[index]),index);
        ds.pop_back();
    }

    //exlude
    sumSubSequenceRepeativeNumber(nums,ds,target,index+1);
}
int main()
{
    vector<int> nums={1,2,3,4,5};
    vector<int> ds;
    int target=6;
    sumSubSequence(nums,ds,target,0);
    cout<<"*****************"<<endl;
    sumSubSequenceRepeativeNumber(nums,ds,target,0);
}