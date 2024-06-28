#include<bits/stdc++.h>
using namespace std;
struct Job
{
    int id;
    int dead;
    int profit;
};
class Solution {
   public:
    bool static cmp(Job a,Job b)
    {
        return a.profit>b.profit;
    }
    pair<int,int> minimumNoOfPlatform(Job arr[],int n)
    {
        sort(arr,arr+n,cmp);
        int maxi=0;
        int cnt=0,profit=0;
        for(int i=0;i<n;i++)
        {
            maxi=max(maxi,arr[i].dead);
        }
        cout<<"maxi is:"<<maxi<<endl;

        vector<int> deadline(maxi+1,-1);

        cout<<endl;

        for(int i=0;i<n;i++)
        {
            int j=arr[i].dead;
            for(int j=arr[i].dead;j>0; j--)
            {
                if(deadline[j]==-1)
                {
                    deadline[j]=arr[i].id;
                    cnt++;
                    profit+=arr[i].profit;
                    break;
                }
            }
            
        }
        return make_pair(cnt,profit);
    }
};
int main()
{
    Job arr[] = {{1,4,20},{2,1,10},{3,2,40},{4,2,30}};
    int n=sizeof(arr)/sizeof(arr[0]);
    // pair<int,int> ans=minimumNoOfPlatform(arr,n)<<endl;
    // cout<<ans.first<<ans.second;
    Solution ob;
    //function call
    pair < int, int > ans = ob.minimumNoOfPlatform(arr, n);
    cout << ans.first << " " << ans.second << endl;
}
