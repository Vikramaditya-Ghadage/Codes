#include<bits/stdc++.h>
using namespace std;
static bool cmp(pair <int, char> a, pair <int, char> b){
    if (a.first < b.first) return true;
    else if(a.first > b.first) return false;
    // else if(a.pos>b.pos) return true;
    // return false;
}

string frequencySort(string s) {  

    vector < pair <int, char> > v;
    map <char, int> m;
    for(int i = 0; i < s.size(); i++){
        m[s[i]]++;
    }
    map <char, int> :: iterator i = m.begin();
    while(i != m.end()){
        v.push_back({i->second, i->first});
        i++;
    }
    sort(v.rbegin(), v.rend(), cmp);
    string ans = "";
    for(int i = 0; i < v.size(); i++){
        int t = v[i].first;
        while(t--)
        {
            ans += v[i].second;
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
    string s="bbbaaddcczzz";
    string ans=frequencySort(s);
    //string ans=frequencySort2(s);
    cout<<ans; 
}