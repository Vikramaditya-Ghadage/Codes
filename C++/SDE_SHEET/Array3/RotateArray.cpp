#include<bits/stdc++.h>
using namespace std;
void rightRotation(vector<int> &nums,int k)
{
    reverse(nums.begin(),nums.begin()+k);
    reverse(nums.begin()+k,nums.end());
    reverse(nums.begin(),nums.end());
}

void leftRotation(vector<int> &nums,int k)
{
    reverse(nums.end()-k,nums.end());
    reverse(nums.begin(),nums.end()-k);
    reverse(nums.begin(),nums.end());
}
int main()
{
    vector<int> nums={1,2,3,4,5};
    // rightRotation(nums,2);
    leftRotation(nums,2);
    for(auto no:nums)
    cout<<no<<endl;      
}