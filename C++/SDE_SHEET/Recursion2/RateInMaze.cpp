#include <bits/stdc++.h>
using namespace std;
void findPath(int i, int j, vector<vector<int>> &mat,int n, vector<string> &ans, string currentPath,vector<vector<int> > &visit)
{
    if(i==n-1 && j== n-1)
    {
        ans.emplace_back(currentPath);
        return;
    }
    
    if(i+1<n && !visit[i+1][j] && mat[i+1][j]==1)
    {
        visit[i][j]=1;
        findPath(i+1, j, mat, n, ans, currentPath+'D',visit);
        visit[i][j]=0;
    }
    
    if(i-1>=0 && !visit[i-1][j] && mat[i-1][j]==1)
    {
        visit[i][j]=1;
        findPath(i-1, j, mat, n, ans, currentPath+'U',visit);
        visit[i][j]=0;
    }
    
    if(j+1<n && !visit[i][j+1]  && mat[i][j+1]==1)
    {
        visit[i][j]=1;
        findPath(i, j+1, mat, n, ans, currentPath+'R',visit);
        visit[i][j]=0;
    }
    
    if(j-1>=0 && !visit[i][j-1]  && mat[i][j-1]==1)
    {
        visit[i][j]=1;
        findPath(i, j-1, mat, n, ans, currentPath+'L',visit);
        visit[i][j]=0;
    }
}


int main()
{
    vector<vector<int> > mat = { { 1, 0, 0, 0 },
                                  { 1, 1, 0, 1 },
                                  { 1, 1, 0, 0 },
                                  { 1, 1, 1, 1 } };


    
    int n = mat.size();
    vector<vector<int> > visit(n,vector<int>(n,0));
    // vector to store all the valid paths
    vector<string> ans;
    // Store current path
    string currentPath = "";


    if (mat[0][0] != 0 && mat[n - 1][n - 1] != 0) {
        // Function call to get all valid paths
        findPath(0, 0, mat, n, ans, currentPath,visit);
    }


    if (ans.size() == 0)
        cout << -1;
    else
        for (int i = 0; i < ans.size(); i++)
            cout << ans[i] << " ";
    cout << endl;


    return 0;
}
