#include<bits/stdc++.h>
using namespace std;
void findAllPermutation(string str,vector<string> &ans,int index)
{
    if(index>=str.length())
    {
        ans.emplace_back(str);
        return;
    }

    for(int j=index;j<str.length();j++)
    {
        swap(str[j],str[index]);
        findAllPermutation(str,ans,index+1);
        swap(str[j],str[index]);
    }
}
void permutationMethod(string str)
{
    do
    {
        cout<<str<<endl;
    }while(next_permutation(str.begin(),str.end()));
}
int main()
{
    string str="CBA";
    vector<string> ans;
    permutationMethod(str);
    //findAllPermutation(str,ans,0);
    for(int i=0;i<ans.size();i++)  cout<<ans[i]<<endl;
}   