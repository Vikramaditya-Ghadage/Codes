#include<bits/stdc++.h>
using namespace std;
// Time-Complixity: O(N Log N) in all cases
// while merging last one [2,4,5] [1,3] remember - 2 is low,5 is mid,1 is mid+1 and 3 is high
void merge(vector<int> &nums,int lb,int mid,int ub)
{
    int n1=mid-lb+1;
    int n2=ub-mid;

    int L[n1],U[n2];
    for(int i=0;i<n1;i++)
    L[i]=nums[lb+i];

    for(int j=0;j<n2;j++)
    U[j]=nums[mid+1+j];

    int i=0,j=0,k=lb;

    while(i<n1 && j<n2)
    {
        if(L[i]<U[j])
        {
            nums[k]=L[i];
            i++;
        }
        else
        {
            nums[k]=U[j];
            j++;
        }
        k++;
    }

    while(i<n1)
    {
        nums[k]=L[i];
        i++;
        k++;
    }

    while(j<n2)
    {
        nums[k]=U[j];
        j++;
        k++;
    }

}
void mergeSort(vector<int> &nums,int lb,int ub)
{
    if(lb<ub)
    {
        int mid=(lb+ub)/2;
        mergeSort(nums,lb,mid);
        mergeSort(nums,mid+1,ub);
        merge(nums,lb,mid,ub);
    }
}

int main()
{
    vector<int> nums={4,2,5,1,3};
    mergeSort(nums,0,nums.size()-1);

    for(auto no:nums)
    cout<<no<<endl;
}
