#include<bits/stdc++.h>
using namespace std;
int main()
{
    vector<int> nums={1,2,2,3,3,3,4,5,5};
    set<int> st;  //store sorted unique elements only
    for(int i:nums)
    st.insert(i);

    nums.clear();
    for(auto it:st)
    nums.emplace_back(it);

    for(auto i:nums)
    cout<<i<<" ";
    cout<<endl;
}