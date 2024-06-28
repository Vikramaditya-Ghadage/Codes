#include<bits/stdc++.h>
using namespace std;
//Sum of n natural number = n * (n + 1) / 2  
void missing_no(vector<int> nums)
{
    int n=nums.size()+1;
    int final_sum=n*(n+1)/2;
    int array_sum=0;
    
    for(int no:nums)
    array_sum+=no;

    cout<<"Missing no is:"<<(final_sum-array_sum);
}
  
vector<int> find_missing_repeating(vector<int> nums)
{
    int n = nums.size();
    int sum=0;
    unordered_map<int,int> mp;

    vector<int> ans;
    //Repeated NO
    for (int i = 0; i < n; i++)
    {
        if(mp.find(nums[i])!=mp.end())
        ans.emplace_back(nums[i]);
        mp[nums[i]]++;
    }
     
     // Missing No
    for(int no=1;no<=nums.size();no++)
    {
        if(mp.find(no)==mp.end())
        {
            ans.emplace_back(no);
            break;
        }
    }

    return ans;
}


int main() {  

    vector<int> array={3,1,5,4,6,7,1};
     vector<int> ans =find_missing_repeating(array);
    for(auto i:ans)
    cout<<i<<endl;
    //missing_no(array);
    return 0;  
}  