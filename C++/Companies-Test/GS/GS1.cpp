#include<bits/stdc++.h>
using namespace std;
//Time Complexity: O(1)
//Space Complexity: O(1)
int countMoves(string src,string des)
{
    int s1=src[0];
    int s2=src[1];

    int d1=des[0];
    int d2=des[1];

    if((s1%2==d1%2 && s2%2!=d2%2) || (s1%2!=d1%2 && s2%2==d2%2))
    return -1;

    if(abs(d2-s2)==abs(d1-s1))
    return 1;
    else
    return 2;
}
int main()
{
    string src="A1";
    string des="D1";
    cout<<"Moves Required:"<<countMoves(src,des);
}