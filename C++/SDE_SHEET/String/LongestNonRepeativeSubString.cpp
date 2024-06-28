#include<bits/stdc++.h>
#include<algorithm>
using namespace std;
// Time-Complixity: O(N) it's a Linear
int longestLength(string str)
{
    unordered_map<int,int> mp;
    int n=str.size();
    pair<int,int> ans(0,0);
    int lb=0,ub=0;
    for(;ub<n;ub++)
    {
        char ch=str[ub];
        if(mp.find(ch)!=mp.end())
        {
            lb=max(mp.at(ch),lb);
        }
        mp[ch]=ub+1;
        int len=ub-lb+1;
        if(len>ans.second)
        {
            ans={lb,len};
        }
    }
    cout<<str.substr(ans.first,ans.second)<<endl;
    return ans.second;
}

int main()
{
    string str="ababababcdeffbababa";
    //string str="abcabcabd";
    int max=0;
    cout<<longestLength(str);
}