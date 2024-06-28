#include<bits/stdc++.h>
using namespace std;
// Time-Complixity: O(N) it's Linear
void sortArray(vector<int> &nums)
{
    int low = 0, mid = 0, high = nums.size() - 1; // 3 pointers

    while (mid <= high) {
        if (nums[mid] == 0) {
            swap(nums[low], nums[mid]);
            low++;
            mid++;
        }
        else if (nums[mid] == 1) {
            mid++;
        }
        else {
            swap(nums[mid], nums[high]);
            high--;
        }
    }
}

// Time-Complixity: O(N) it's Linear
void sortArrayMinHeap(vector<int> &nums)
{
    priority_queue<int,vector<int>,greater<int>> min_heap;
    int n=nums.size();
    for(int i=0;i<n;i++)
    min_heap.push(nums[i]);

    int i=0;
    while(!min_heap.empty())
    {
        nums[i++]=min_heap.top();
        min_heap.pop();
    }
}

int main()
{
    vector<int> nums={1,1,0,2,2,0,1,2,0,0,1};
    sortArray(nums);
    for(int i:nums)cout<<i;
}