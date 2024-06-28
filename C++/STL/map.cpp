#include<bits/stdc++.h>
using namespace std;
int main()
{
    map<int,int> mp;   // Time complixity in log(N) in case of insertion,updation and deltion(red black tree(BST))
    unordered_map<int,int> mp1;  // Time complixity in O(1) in case of insertion,updation and deltion(HashTable)
    int nums[]={3,6,6,7,8,3,3,8};
    int sum=0;
    for(auto no:nums)
    mp[no]++;

    for(auto m:mp)
    cout<<m.first<<":"<<m.second<<endl;
}