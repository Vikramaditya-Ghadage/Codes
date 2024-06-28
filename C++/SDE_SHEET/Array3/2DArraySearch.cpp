 #include<bits/stdc++.h>
 using namespace std;
 // Time-Complixity: O(log(M*N))
void searchMatrix(vector<vector<int>>& matrix, int target) {
    int m=matrix.size();
    int n=matrix[0].size();
    bool flag=true;

    int lb=0,ub=(m*n)-1;
    while(lb<=ub)
    {
        int mid=(lb+ub)/2;
        int row=mid/n,col=mid%n;
        if(matrix[row][col]==target)
        { 
            cout<<"Found at:"<<row<<","<<col<<endl;
            flag=!flag;
            break;
        }
        else if(matrix[row][col]<target) lb=mid+1;
        else ub=mid-1;
    }
    
    if(flag)
    cout<<"Not Found"<<endl;
}

int main()
{
    vector<vector<int>> matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
    searchMatrix(matrix,8);
}