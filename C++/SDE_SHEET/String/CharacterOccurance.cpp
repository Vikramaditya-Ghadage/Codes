#include<bits/stdc++.h>
using namespace std;
int main()
{
    string str="aabbcccdddd";
    unordered_map<char,int> mp;

    for(int i=0;i<str.length();i++)
    {
        mp[str[i]]++;
    }

    for(auto i:mp)
    cout<<i.first<<":"<<i.second<<endl;
}