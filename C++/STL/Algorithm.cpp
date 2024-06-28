#include<iostream>
#include<vector>
#include<algorithm>
#include<bits/stdc++.h>
using namespace std;
int main()
{
    vector<int> v;
    for(int i=1;i<=5;i++)
    v.emplace_back(i*i);

    cout<<"*********************"<<endl;

    reverse(v.begin(),v.end());
    for(auto i:v) cout<<i<<endl;
     cout<<"*********************"<<endl;

    sort(v.begin(),v.end());
    for(auto i:v) cout<<i<<endl;
    
    cout<<"max:"<<*max(v.begin(),v.end())<<endl;
    cout<<"min:"<<*min(v.begin(),v.end())<<endl; 

    cout<<"Sum is:"<<accumulate(v.begin(),v.end(),0)<<endl;  

    if (binary_search(v.begin(), v.end(), 15))
    cout << "15 exists in vector";
    else
        cout << "15 does not exist";

}