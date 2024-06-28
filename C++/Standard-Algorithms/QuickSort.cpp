#include<bits/stdc++.h>
using namespace std;
// Time-Complixity: O(N Log N)  Worst case: O(n^2)
int partition(vector<int> &nums,int lb,int ub)
{
    int pivot=nums[ub];
    int i=lb-1;
    for(int j=lb;j<ub;j++)
    {
        if(nums[j]<pivot)
        {
            i++;
            swap(nums[i],nums[j]);
        }
    }
    swap(nums[i+1],nums[ub]);
    return i+1;

}
void quickSort(vector<int> &nums,int lb,int ub)
{
    if(lb<ub)
    {
        int pi=partition(nums,lb,ub);
        quickSort(nums,lb,pi-1);
        quickSort(nums,pi+1,ub);
    }
}

int main()
{
    vector<int> nums={3,5,1,4,6,2};
    // vector<int> nums={5,4,3,2,1};
    int n=nums.size();
    quickSort(nums,0,n-1);
    for(auto no:nums)
    cout<<no<<endl;
}