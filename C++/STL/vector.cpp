#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
int main()
{
    vector<int> v;
    for(int i=1;i<=5;i++) v.emplace_back(i);      // append element in vector  
    for(auto i:v) cout<<i<<endl;
    cout<<"First element of vector:"<<v.front()<<endl;  // gave first element of vector
    cout<<"Last element of vector:"<<v.back()<<endl;    // Gave last element of vector
    cout<<*(v.end())<<endl;
      

    v.insert(v.begin()+3,100);    // insert element at perticuler position
    for(auto itr=v.begin();itr!=v.end();itr++)
    cout<<*itr<<endl;
    cout<<"First element of vector:"<<v[0]<<endl;       // Also get first element of vector by index
    v.erase(v.begin()+3);    // insert element at perticuler position
    v.pop_back();                 // pop last element from vector




    for(int i=0;i<v.size();i++) cout<<v[i]<<endl;
    cout<<"size:"<<v.size()<<endl;
    v.clear();
    cout<<"size:"<<v.size()<<endl;
    cout<<"Capacity:"<<v.capacity()<<endl;


    if(v.empty()) cout<<"empty";
    else cout<<"not empty";

}
