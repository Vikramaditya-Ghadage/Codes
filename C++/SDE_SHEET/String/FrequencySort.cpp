#include<bits/stdc++.h>
using namespace std;
bool cmp(pair<char,int> first,pair<char,int> second)
{
    if(first.second>second.second || first.second==second.second) return true;
    else return false;
}
string frequencySort(string str)
{
    string ans="";
    unordered_map<char,int> mp;
    vector<pair<char,int>> words;
    
    for(auto i:str)
    mp[i]++;
    
    for(const auto& i:mp)
    words.emplace_back(i.first,i.second);
    
    sort(words.begin(),words.end(),cmp);
    
    for(auto i:words)
    {
        int no=i.second;
        while(no--)
        {
            ans+=i.first;
        }
    }
    return ans;
    
}

// Time-Complixity: O(N) it's a Linear
string frequencySort2(string s) {  

    unordered_map <char ,int>mp;
    for(int i = 0; i < s.size(); i++){
        mp[s[i]]++;
    }
    
    multimap<int,char> mp1;
    for(auto it:mp)
    {
        mp1.insert({it.second, it.first});
    }

    for(auto it:mp1)
    {
        cout<<it.first<<":"<<it.second<<endl;
    }

    string ans = "";
    for(auto it:mp1){
        int t = it.first;
        while(t--)
        {
            ans += it.second;
        }
    }

    reverse(ans.begin(),ans.end());
    return ans;
    
}
int main()
{
    string s="abbcccdddde";
    string ans=frequencySort(s);
    //string ans=frequencySort2(s);
    cout<<ans; 
}
