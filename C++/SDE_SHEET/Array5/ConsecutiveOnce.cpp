#include<bits/stdc++.h>
using namespace std;
// Time-Complixity: O(N) it's a Linear
int main()
{
    vector<int> nums={1, 0, 1, 1, 0, 1,1,1,1};
    int all_time_max=0;
    int current_max=0;
    for(int i=0;i<nums.size();i++)
    {
        if(nums[i]==1)
        current_max++;
        else
        {
            all_time_max=max(all_time_max,current_max);
            current_max=0;
        }
    }
    cout<<"Maximum consecutive once are:"<<max(all_time_max,current_max);
}