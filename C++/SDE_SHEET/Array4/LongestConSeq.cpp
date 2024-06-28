 #include<bits/stdc++.h>
 using namespace std;
 int findCntBruteForce(vector<int> nums)
 {
    sort(nums.begin(),nums.end());
    int current_max=1;
    int all_time_max=1;
    for(int i=0;i<nums.size()-1;i++)
    {
        if(nums[i]+1==nums[i+1])
        current_max++;
        else if(nums[i]==nums[i+1])
        continue;
        else
        {
            all_time_max=max(all_time_max,current_max);
            current_max=1;
        }
        
    }
    return max(current_max,all_time_max);

 }

// Time-Complixity: O(N) it's Linear
int findConsecutiveCnt(vector<int> nums)
 {
    int n=nums.size();
    
    if(n==0)
    return 0;

    int all_time_max=1;

    unordered_set<int> st;
    for(auto no:nums)
    st.insert(no);

    for(auto it:st)
    {
        if(st.find(it-1)==st.end())
        {
            int current_max=1;
            int no=it;
            while(st.find(no+1)!=st.end())
            {
                current_max++;
                no++;
            }
            all_time_max=max(all_time_max,current_max);
        }
    }
    return all_time_max;

 }
 int main()
 {
   // vector<int> nums={0,1,1,2,2,2,3,3,4};
    vector<int> nums={100,4,200,1,3,2};
    cout<<findCntBruteForce(nums)<<endl;
    cout<<findConsecutiveCnt(nums)<<endl;
 }