#include<bits/stdc++.h>
using namespace std;
int minimumNoOfPlatform(int arr[],int dept[],int n)
{
    sort(arr,arr+n);
    sort(dept,dept+n);

    int i=1,j=0;
    int platform_needed=1,ans=1;

    while(i<n && j<n)
    {
        if(arr[i]<=dept[j])
        {
            platform_needed++;
            i++;
        }
        else
        {
            platform_needed--;
            j++;
        }
        ans=max(ans,platform_needed);
    }
    return ans;
}
int main()
{
    int arr[] = {900, 940, 950, 1100, 1500, 1800};
    int dept[] = {910, 1200, 1120, 1130, 1900, 2000};
    int n=sizeof(arr)/sizeof(arr[0]);
    cout<<"Minimum no of platforms needed:"<<minimumNoOfPlatform(arr,dept,n)<<endl;
}