#include<bits/stdc++.h>
using namespace std;
struct Meeting
{
    int start;
    int end;
    int pos;
};

class Solution {
   public:
    bool static cmp(Meeting a,Meeting b)
    {
        if(a.end<b.end) return true;
        else if(a.end>b.end) return false;
        else if(a.pos>b.end) return true;
        return false;
    }
    void mettingRoom(int start[],int end[],int n)
    {
        struct Meeting arr[n];
        for(int i=0;i<n;i++)
        arr[i].start=start[i],arr[i].end=end[i],arr[i].pos=i+1;

        sort(arr,arr+n,cmp);

        vector<int> pos;
        int limit=arr[0].end;
        pos.emplace_back(arr[0].pos);
        for(int i=1;i<n;i++)
        {
            if(arr[i].start>limit)
            {
                limit=arr[i].end;
                pos.emplace_back(arr[i].pos);
            }
        }

        for(auto it:pos)
        cout<<it<<" ";

    }
};

int main() {
    Solution obj;
    int start[] = {10, 12, 20};
    int end[] = {20, 25, 30};
    int n=sizeof(start)/sizeof(start[0]);
    obj.mettingRoom(start, end, n);
    return 0;
}