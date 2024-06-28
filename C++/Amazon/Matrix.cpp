#include<bits/stdc++.h>
using namespace std;
int main()
{
    int m=2,n=3;
    int a[m][n]={{4,2,3},{9,4,6}};
    int x=m,y=n;
    if(m>n)
    y=m;
    else
    x=n;
    vector<vector<int>> arr(x,vector<int>(y,1));
    unordered_map<int,int> mp;
    // for(int i=0;i<arr.size();i++)
    // {
    //     arr[i].resize(n,1);
    // }
    for(int i=0;i<arr.size();i++)
    {
        cout<<endl;
        for(int j=0;j<arr[i].size();j++)
        {
            if(i<m && j<n)
            arr[i][j]=a[i][j];

            if(i!=j)
            mp[arr[i][j]]++;
        }
    }

    for(auto i:mp)cout<<i.first<<":"<<i.second<<endl;
    int sum=0;
    for(int i=0;i<arr.size();i++)
    {
        cout<<endl;
        for(int j=0;j<arr[i].size();j++)
        {
            cout<<arr[i][j]<<"\t";
            if(i==j)
            {
                int no=arr[i][j];
                if(mp.find(no)!=mp.end())
                {
                    if(mp.at(no)%2==1)
                    sum+=no;

                }
            }
        }
    }

    cout<<"sum is:"<<sum<<endl;

}
