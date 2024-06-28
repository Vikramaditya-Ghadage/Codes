#include<bits/stdc++.h>
using namespace std; 
int binerySearch(vector<int> nums,int lb,int ub,int target)
{    
    while(lb<=ub)
    {
        int mid=(lb+ub)/2;
        cout<<mid<<":"<<nums[mid]<<endl;
        if(nums[mid]==target)
        return mid;
        if(nums[mid]<target)
        lb=mid+1;

        if(nums[mid]>target)
        ub=mid-1;
    }
    return -1;
}   
int main()
{
   vector<int> nums={5,4,1,2,3};
   sort(nums.begin(),nums.end());
   int target=2;
   int res=binerySearch(nums,0,nums.size()-1,target);
   cout<<res<<endl;
   if(res!=-1)
   {
        cout<<"Found";
   }
   else
   {
        cout<<"Not Found";
   }

}