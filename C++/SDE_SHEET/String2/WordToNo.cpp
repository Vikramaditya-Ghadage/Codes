#include <bits/stdc++.h>
using namespace std;
unordered_map<string, int> mp = {
        {"zero", 0},
        {"one", 1},
        {"two", 2},
        {"three", 3},
        {"four", 4},
        {"five", 5},
        {"six", 6},
        {"seven", 7},
        {"eight", 8},
        {"nine", 9},
        {"ten", 10},
        {"eleven", 11},
        {"twelve", 12},
        {"thirteen", 13},
        {"fourteen", 14},
        {"fifteen", 15},
        {"sixteen", 16},
        {"seventeen", 17},
        {"eighteen", 18},
        {"nineteen", 19},
        {"twenty", 20},
        {"thirty", 30},
        {"forty", 40},
        {"fifty", 50},
        {"sixty", 60},
        {"seventy", 70},
        {"eighty", 80},
        {"ninety", 90},
        {"hundred", 100},
        {"thousand", 1000},
        {"million", 1000000},
        {"billion", 1000000000},
};

int main() {
    
    int ans=0;
    int currentNo=0;
    vector<string> s={"thirty", "six", "thousand","four","hundred","forty","two"};
    
    for(int i=0;i<s.size();i++)
    {
       int no=mp.at(s[i]);
       
       if(no>=100)
       {
           currentNo*=no;
       }
       else
       {
           currentNo+=no;
       }
       
       if(currentNo>=1000)
       {
           ans+=currentNo;
           currentNo=0;
       }
       
       
       cout<<s[i]<<":"<<currentNo<<endl;
    }
    ans+=currentNo;
    cout<<ans;
    return 0;
}
