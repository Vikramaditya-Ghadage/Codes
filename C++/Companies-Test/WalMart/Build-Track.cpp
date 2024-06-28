#include<bits/stdc++.h>
#include<vector>
using namespace std;
int main()
{
    vector<vector<bool>> v={
        {true,true,true,false,false},
        {true,true,true,true,true,true,false,false,false},
        {true,false},
        {true,true,false},
        {true,true,true,true,false}
    };
    vector<float> per(v.size());
    

    for(int i=0;i<v.size();i++)
    {
        cout<<endl;
        float n=v[i].size();
        int f_cnt=0;
        for(int j=0;j<v[i].size();j++)
        {
            if(v[i][j]==0)
            f_cnt++;
        }        
        // per.emplace_back((f_cnt*100)/v[i].size());
        // float val=(f_cnt*100)/v[i].size();
        per[i]=((f_cnt*100)/n);
        cout<<per[i];
    }
    int ans=0;
    cout<<endl;
    for(int i=0;i<per.size()-1;i++)
    {
        if(per[i]>per[i+1])
        ans++;
    }

    cout<<endl<<"ans is:"<<ans;
}