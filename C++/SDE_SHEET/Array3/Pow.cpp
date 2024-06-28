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
    int n1=n;
    if(n1<0) n1=n1*(-1);

    while(n1)
    {
        if(n1%2==0)
        {
            no=no*no;
            n1=n1/2;
        }
        else
        {
            ans*=no;
            n1--;
        }
    }

    if(n<0)
    ans=1.0/ans;

    return ans;
 }
 int main()
 {
    cout<<calPowBruteForce(2,10)<<endl;
    cout<<calPow(2,10)<<endl;
 }