#include<bits/stdc++.h>
using namespace std;
// Time Complexity: O(N logN)
string longestCommonPrefix(vector<string>& v) {
    string res="";
    sort(v.begin(),v.end());
    string first=v[0],last=v[v.size()-1];
    for(int i=0;i<min(first.size(),last.size());i++)
    {
        if(first[i]!=last[i])
        return res;

        res=res+first[i];
    }
    return res;
}

int main()
{

    vector<string> v = {"flower","flow","flight"};
   // vector<string> v = {"aaa","aa","aaaa"};
    cout<<longestCommonPrefix(v);

}
