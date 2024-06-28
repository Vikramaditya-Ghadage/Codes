#include<bits/stdc++.h>
using namespace std;
int main()
{
    unordered_set<int> s1; //Time complixity in O(1) in case of insertion,updation and deltion(HashTable)
    set<int> st;   // Time complixity in log(N) in case of insertion,updation and deltion(red black tree(BST))
    st.insert(1);   //{1}
    st.insert(4);   //{1,4}
    st.insert(2);   //{1,2,4}
    st.insert(3);   //{1,2,3,4}
    
    for(int i=1;i<=5;i++)
    st.insert(rand());

    cout<<"find:"<<*(st.find(41))<<endl;

    for(auto i:st)
    cout<<i<<endl;
}