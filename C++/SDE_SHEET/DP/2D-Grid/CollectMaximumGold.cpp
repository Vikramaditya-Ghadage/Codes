#include<bits/stdc++.h>
using namespace std;
int collectMaxGoldMemorization(int i,int j,vector<vector<int>> mat,vector<vector<int>> &dp)
{
    if (i == 0 && j == 0)
        return mat[0][0]; // If we are at the top-left corner, the minimum path sum is the value at (0, 0)
    if (i < 0 || j < 0)
        return INT_MAX; // If we go out of bounds, return a large value to avoid considering this path
    if (dp[i][j] != -1)
        return dp[i][j]; // If the result is already computed, return it

    // Calculate the minimum sum path by considering moving up and moving left
    int up = mat[i][j] + collectMaxGoldMemorization(i - 1, j, mat, dp);
    int left = mat[i][j] + collectMaxGoldMemorization(i, j - 1, mat, dp);

    // Store the result in the DP table and return it
    return dp[i][j] = max(up, left);
}
int collectMaxGoldTabulation(vector<vector<int>> mat,vector<vector<int>> &dp,int m,int n)
{
    for(int i=0;i<m;i++)
    {
        for(int j=0;j<n;j++)
        {
            // if (i > 0 && j > 0 && maze[i][j] == -1) {
            //     dp[i][j] = 0; // If there's an obstacle at (i, j), no paths can pass through it
            //     continue;
            // }

            if(i==0 && j==0)
            dp[i][j]=mat[i][j];
            else
            {
                int down=mat[i][j];
                if(i>=1)
                down+=dp[i-1][j];
                else
                down=INT_MIN;
                
                int right=mat[i][j];
                if(j>=1)
                right+=dp[i][j-1];
                else
                right=INT_MIN;

                dp[i][j]=max(down,right);
            }
        }
    }

    return dp[m-1][n-1];
}
int main()
{
    vector<vector<int>> mat={
                    {1, 3, 11, 5},
                    {2, 2, 4, 1},
                    {5, 0, 2, 3},
                    {0, 6, 1, 2}};
    int row=mat.size();
    int col=mat[0].size();
    vector<vector<int>>dp(row,vector<int>(col,-1));
    cout<<"maximum gold collect:"<<collectMaxGoldMemorization(row,col,mat,dp)<<endl;
    // cout<<"maximum gold collect:"<<collectMaxGoldTabulation(mat,dp,row-1,col-1)<<endl;

    for(auto i:dp)
    {
        cout<<endl; 
        for(auto j:i)
        cout<<j<<" ";
    }
}