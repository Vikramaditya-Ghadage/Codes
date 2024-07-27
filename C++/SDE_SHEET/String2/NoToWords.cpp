#include <bits/stdc++.h>	
using namespace std;
string one[] = { "", "one ", "two ", "three ", "four ",
                 "five ", "six ", "seven ", "eight ",
                 "nine ", "ten ", "eleven ", "twelve ",
                 "thirteen ", "fourteen ", "fifteen ",
                 "sixteen ", "seventeen ", "eighteen ",
                 "nineteen " };
string ten[] = { "", "", "twenty ", "thirty ", "forty ",
                 "fifty ", "sixty ", "seventy ", "eighty ",
                 "ninety " };
   
string noToWord(long no,string s)
{
    string ans;
    
    if(no>19)
    ans+=ten[no/10]+one[no%10];
    else
    ans+=one[no];
    
    if(no)
    ans+=s+" ";
    
    cout<<no<<":"<<ans<<endl;
    
    return ans;
}
string convertToString(long no)
{
    string ans;
    
    ans+=noToWord((no/10000000),"crore");
    ans+=noToWord((no/100000)%100,"lakh");
    ans+=noToWord((no/1000)%100,"thousand");
    ans+=noToWord((no/100)%10,"hundred and");
    
    ans+=noToWord((no%100),"");
    
    return ans;
}


int main() {
    
    long no=128836442;
    cout<<convertToString(no);
    return 0;
}
