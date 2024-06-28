// C++ program for coin change problem.
#include<bits/stdc++.h>
#include<algorithm>

using namespace std;

void findSum(vector<int> coins,vector<int> ds,vector<vector<int>> &ans, int amount,int index)
{
    if(index>=coins.size())
    {
        if(amount==0)
        ans.emplace_back(ds);
        return;
    }
    //include
    if(coins[index]<=amount)
    {
        ds.emplace_back(coins[index]);
        findSum(coins,ds,ans,amount-coins[index],index);
        ds.pop_back();
    }
    
    //exclude
    findSum(coins,ds,ans,amount,index+1);
}
int main()
{
	vector<int> coins={1,2,5};
	vector<int> ds;
    vector<vector<int>> ans;
    int amount=11;
    int index=0;
    findSum(coins,ds,ans,amount,index);
    for(int i=0;i<ans.size();i++)
    {
        cout<<endl;
        for(int j=0;j<ans[i].size();j++)
        {
            cout<<ans[i][j];
        }
    }
}

