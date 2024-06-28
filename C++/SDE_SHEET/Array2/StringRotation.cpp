#include <algorithm>  
#include <iostream>  
#include <string>
  
using namespace std;
void rightRatation(string &str,int k)
{
    reverse(str.begin(),str.begin()+k);
    reverse(str.begin()+k,str.end());
    reverse(str.begin(),str.end());
}
void leftRatation(string &str,int k)
{
    reverse(str.end()-k,str.end());
    reverse(str.begin(),str.end()-k);
    reverse(str.begin(),str.end());
}
int main() {  
  string str = "Hello";
  cout << "Before Rotate : "<< str << endl; 
  int k=4;
  int n=str.size();
  k=k%n;
  cout<<"k:"<<k<<"  n:"<<n<<endl;
  //rotate(str.begin(), str.begin() +k, str.end());
  rightRatation(str,k);
  cout <<"After Left Rotatation  : " << str << endl;

  leftRatation(str,k);
  cout <<"After Right Rotatation  : " << str << endl;

  
    
  return 0;  
}  