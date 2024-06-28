#include<bits/stdc++.h>
using namespace std;
// Time Complexity:n^2
string longestPalindrome(string str) {
    int n = str.size();
    pair<int,int> best{0,1}; // start index and length
    for (int i = 0; i < 2*n - 1; i++) {
        // find boundary of palindrome from center
        int lb = i/2, ub = (i+1)/2;
        while (lb >= 0 && ub < n && str[lb] == str[ub]) {
            lb--, ub++;
        }
        int len = ub - lb - 1;
        if (len > best.second) {
            best = {lb+1, len};
        }
    }
    return str.substr(best.first, best.second);
}

int main()
{
    string str="abcdca";
    cout<<longestPalindrome(str);
    return 0;
}