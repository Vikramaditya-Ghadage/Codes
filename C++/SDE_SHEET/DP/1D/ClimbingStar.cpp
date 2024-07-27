#include <bits/stdc++.h>
using namespace std;

int calculateWays(int n)
{
    vector<int>dp(n+1,-1);
    dp[0]=0;
    dp[1]=1;
    for(int i=2;i<=n;i++)
    {
        dp[i]=dp[i-1]+dp[i-2];
    }


    return dp[n];
}
int climbStairs(int n) 
{
    int prev2 = 1;
    int prev = 1;
    for(int i=2; i<=n; i++){
        int cur_i = prev2+ prev;
        prev2 = prev;
        prev= cur_i;
    }
    return prev;
}

int main()
{
    cout<<climbStairs(10);
}







