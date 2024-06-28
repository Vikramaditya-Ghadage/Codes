#include<bits/stdc++.h>
using namespace std;
struct Item
{
    int value;
    int weight;
};

class Solution {
   public:
    bool static cmp(Item a,Item b)
    {
        double r1=(double)a.value/(double)a.weight;
        double r2=(double)b.value/(double)b.weight;
        return r1>r2;
    }
    double fractionalKnapsack(int weight, Item arr[], int n)
    {
        sort(arr,arr+n,cmp);

        int currentWeight=0;
        double ans=0;

        for (int i = 0; i < n; i++) 
        {
            if(currentWeight+arr[i].weight<=weight)
            {
                currentWeight+=arr[i].weight;
                ans+=arr[i].value;
            }
            else
            {
                int remain=weight-currentWeight;
                ans+=((double)arr[i].value/(double)arr[i].weight) * remain;
                break;
            }
        }
        return ans;

    }
};

int main() {
   int n = 3, weight = 50;
   Item arr[n] = { {100,20},{60,10},{120,30} };
   Solution obj;
   double ans = obj.fractionalKnapsack(weight, arr, n);
   cout << "The maximum value is " << ans;
   return 0;
}