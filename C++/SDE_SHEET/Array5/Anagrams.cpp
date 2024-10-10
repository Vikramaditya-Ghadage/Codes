#include <bits/stdc++.h>
using namespace std;

int main() {
    vector<string> input = {"listen", "silent", "enlist", "eat", "tea", "tan", "nat", "bat"};

    unordered_map<string,vector<string>> mp;
    for(string s1:input)
    {
        string s2=s1;
        sort(s2.begin(),s2.end());
        mp[s2].emplace_back(s1);
    }
    
    for(auto i:mp)
    {
        cout<<endl;
        for(auto j:i.second)
        cout<<j<<" ";
    }
    return 0;
}
