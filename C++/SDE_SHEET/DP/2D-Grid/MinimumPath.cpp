#include<bits/stdc++.h>
using namespace std;
int collectMinPointTabulation(vector<vector<int>> mat,vector<vector<int>> &dp,int s1,int s2,int d1,int d2)
{
    for(int i=s1;i>=d1;i--)
    {
        for(int j=s2;j<=d2;j++)
        {
            if(i==s1 && j==s2)
            dp[i][j]=mat[i][j];
            else
            {
                int up=mat[i][j];
                if(i<s1)
                up+=dp[i+1][j];
                else
                up=INT_MAX;

                int right=mat[i][j];
                if(j>s2)
                right+=dp[i][j-1];
                else
                right=INT_MAX;

                // cout<<dp[i][j]<<" "<<up<<" "<<right<<endl;
                dp[i][j]=min(up,right);
            }
        }
    }

    return dp[d1][d2];
}
int main()
{
    vector<vector<int>> mat={{1, 3, 4, 5},
                   {2, 3, 4, 1},
                   {5, 4, 2, 3},
                   {0, 6, 1, 2}};
    int row=mat.size();
    int col=mat[0].size();
    vector<vector<int>>dp(row,vector<int>(col,-1));
    cout<<"maximum gold collect:"<<collectMinPointTabulation(mat,dp,row-1,0,0,col-1)<<endl;

    for(auto i:dp)
    {
        cout<<endl;
        for(auto j:i)
        cout<<j<<" ";
    }
}