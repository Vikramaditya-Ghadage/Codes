#include<bits/stdc++.h>
using namespace std;
// Time-Complixity: O(N^2) it's a Quadratic in all cases
void insertionSort(vector<int> &nums)
{
    int n=nums.size();
    for(int i=1;i<n;i++)
    {
        int key=nums[i];
        int j=i-1;
        while(j>=0 && nums[j]>key)
        {
            nums[j+1]=nums[j];
            j--;
        }
        nums[j+1]=key;
    }
}

int main()
{
    vector<int> nums={4,5,1,3,2};
    insertionSort(nums);
    for(auto i:nums)
    cout<<i<<endl;
    
}