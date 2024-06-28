#include<bits/stdc++.h>
using namespace std;
struct wrk
{
    int profit;
    int dif;
};
class Solution {
public:
    bool static cmp(wrk a1,wrk a2)
    {
        return a1.profit>a2.profit;               
    }
    
    int maxProfitAssignment(vector<int>& difficulty, vector<int>& profit, vector<int>& worker) {
        int n=profit.size();
        wrk arr[n];
        int max_profit=0;
        for(int i=0;i<n;i++)
        {
            arr[i].profit=profit[i];
            arr[i].dif=difficulty[i];
        }
        sort(arr,arr+n,cmp);
        for(int i=0;i<worker.size();i++)
        {
            for(int j=0;j<n;j++)
            {
                if(worker[i]>=arr[j].dif)
                {
                    max_profit+=arr[j].profit;
                    break;
                }
                
            }
        }
        return max_profit;
    }

     int maxProfitAssignmentOptimal(vector<int>& difficulty, vector<int>& profit, vector<int>& worker) {
        vector<pair<int, int>> infos;
        for (int i = 0; i < difficulty.size(); i++) {
            infos.emplace_back(difficulty[i], profit[i]);
        }
        sort(infos.begin(), infos.end());
        
        vector<pair<int, int>> maxProfitForDifficulty;
        int maxp = 0;
        for (auto& info : infos) {
            int d = info.first, p = info.second;
            maxp = max(maxp, p);
            maxProfitForDifficulty.emplace_back(d, maxp);
        }
        
        int totalProfit = 0;
        for (int w : worker) {
            int ind = binarySearch(maxProfitForDifficulty, w);
           // cout<<w<<":ind:"<<ind<<" "<<maxProfitForDifficulty[ind].first<<endl;
            if (ind >= 0 && w >= maxProfitForDifficulty[ind].first) {
                totalProfit += maxProfitForDifficulty[ind].second;
            }
        }
        return totalProfit;
     }
    int binarySearch(vector<pair<int, int>>& list, int target) {
        int left = 0, right = list.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            cout<<mid<<" "<<list[mid].first<<" "<<target<<endl;
            if (list[mid].first <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return right;
    }
};
int main()
{
    vector<int> profit={10,20,30,40,50};
    vector<int> diff={2,4,6,8,10};
    vector<int> worker={4,5,6,7};

    Solution ob;
    //cout << ob.maxProfitAssignment(diff,profit,worker) << endl;
    cout << ob.maxProfitAssignmentOptimal(diff,profit,worker) << endl;
}
