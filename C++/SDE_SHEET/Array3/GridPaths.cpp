 #include<bits/stdc++.h>
 using namespace std;

// Time Complexity: O(2^n) - Exponential time
int countPaths(int i,int j,int m,int n)
{
        if(i==(m-1)&&j==(n-1)) return 1;
        if(i>=m||j>=n) return 0;
        int down=countPaths(i+1,j,m,n);
        int right=countPaths(i,j+1,m,n);
        
        return down+right;

}

// Time-Complixity: O(n*m) 
int countPathsDp(int i,int j,int m,int n,vector<vector<int>> &dp)
{
        if(i==(m-1)&&j==(n-1)) return 1;
        if(i>=m||j>=n) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        else return dp[i][j]=countPathsDp(i+1,j,m,n,dp)+countPathsDp(i,j+1,m,n,dp);
}

int uniquePaths(int m, int n) {
        vector<vector<int>> dp(m+1,vector<int>(n+1,-1));

        //dp[1][1]=1;
        int num=countPathsDp(0,0,m,n,dp);
        if(m==1&&n==1)
                return num;
        return dp[0][0];
}

//Time-Complixity: O(m-1) or O(n-1) 
int uniquePathsOptimal(int m, int n) {
   int N = n + m - 2;
   int r = m - 1;
   double res = 1;
   
   // for (int i = 1; i <= r; i++)
   //     res = res * (N - r + i) / i;

   for (int i = 1; i <= r; i++)
   res = res * (N+1-i) / i;
   return (int)res;
}

int main()
{
   int m=4,n=4;
   vector<vector<int>> dp(m+1,vector<int>(n+1,-1));
   cout<<"The total number of Unique Paths are "<<countPaths(0,0,m,n)<<endl;
   cout<<"The total number of Unique Paths are "<<uniquePaths(m,n)<<endl;
   cout<<"The total number of Unique Paths are "<<uniquePathsOptimal(m,n)<<endl;
}