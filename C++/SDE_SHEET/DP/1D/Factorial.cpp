#include <bits/stdc++.h>
using namespace std;
//Regular Recursion
int calFact(int n)
{
    if(n<=1) return n;
    
    return n*calFact(n-1);
}
//recursion using Memoization: Top-down approach TC:O(N) SC:O(N)+O(N) take extra space for store dp array
int printFact(int n,vector<int> & dp)
{
    if(n<=1) return n;
    if(dp[n]!=-1) return dp[n];
    else return dp[n]=n*printFact(n-1,dp);
}

// Tabulation: Bottom-up approach  TC:O(N) SC:O(N)
int fact(int n) {
    if(n <=1) return n; 
    
    vector<int> res(n+1,-1);
       
    res[0] = 1;
    for (int i = 1; i <= n; ++i) {
     res[i] = i * res[i - 1];
    }
    return res[n];
   
}
int main() {
    int n=5;
    vector<int> dp(n+1,-1);
    cout<<calFact(n)<<endl;
    cout<<printFact(n,dp)<<endl;
    cout<<fact(n)<<endl;
    
    return 0;
}
