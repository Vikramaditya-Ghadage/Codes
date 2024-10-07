#include<bits/stdc++.h>
using namespace std;

int main() {
    std::vector<int> a = {2, 2, 4};
    std::vector<int> b = {1, 2, 3};

    int no_of_wins = 0;
    int i = 0, j = 0;
    int n = a.size();
    int m = b.size();

    while (i < n && j < m) {
        if (a[i] <= b[j]) {
            no_of_wins += j;
            i++;
        } else {
            j++;
        }
    }
    
    while (i < n)
    {
       no_of_wins += j;
       i++; 
    }


    std::cout << "Number of wins: " << no_of_wins << std::endl;
    return 0;
}
