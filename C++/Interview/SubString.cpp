#include<bits/stdc++.h>
using namespace std;
void subString(string str)
{
    for(int i=0;i<str.length();i++)
    {
        for(int j=i;j<str.length();j++)
        {
            for(int k=i;k<=j;k++)
            cout<<str[k];
            cout<<endl;
        }
    }
    
}
int main()
{
    string str="good";
    int sum=0;
    subString(str);
}