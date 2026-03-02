 #include<bits/stdc++.h>
 using namespace std;
 
 // Time-Complixity: O(N) it's a Linear
 double calPowBruteForce(double no,int n)
 {
    double ans=1.0;
    while(n--)
    {
        ans*=no;
    }
    return ans;
 }

 // Time-Complixity: O(log(n))
 double calPow(double no,int n)
 {
    double ans=1.0;
    int cnt=n;
    if(cnt<0) cnt=cnt*(-1);

    while(cnt)
    {
        if(cnt%2==0)
        {
            no=no*no;
            cnt=cnt/2;
        }
        else
        {
            ans*=no;
            cnt--;
        }
    }

    if(n<0)
    ans=1.0/ans;

    return ans;
 }
 int main()
 {
    // cout<<calPowBruteForce(2,3)<<endl;
    cout<<calPow(2,3)<<endl;
 }