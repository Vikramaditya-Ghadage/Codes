#include <bits/stdc++.h>
using namespace std;
void mergeOverlappingIntervals(vector<vector<int>> &nums)
{
    sort(nums.begin(),nums.end());
    vector<vector<int>> temp;
    for(int i=0;i<nums.size();i++)
    {
        if(temp.empty()|| nums[i][0]>temp.back()[1])
        temp.emplace_back(nums[i]);
        else
        temp.back()[1]=max(temp.back()[1],nums[i][1]);
    }
    nums=temp;
}
int main()
{
    vector<vector<int>> nums = {{1, 3}, {8, 10}, {2, 6}, {15, 18}};
    // vector<vector<int>> nums = {{1, 9}, {2, 5}, {19, 20}, {10, 11},{12, 20}, {0, 3}, {0, 1}, {0, 2}};
    mergeOverlappingIntervals(nums);
    cout <<"The merged intervals are:"<<endl;
    for (auto it : nums) {
        cout << "[" << it[0] << ", " << it[1] << "] ";
    }
    cout << endl;
    return 0;
}

