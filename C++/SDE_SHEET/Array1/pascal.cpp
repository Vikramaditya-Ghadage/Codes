#include<bits/stdc++.h>
using namespace std;

class Solution {
public:
    vector<vector<int>> generate(int numRows) {
        vector<vector<int>> nums(numRows);
        
        for(int i = 0; i < nums.size(); i++) {
            nums[i].resize(i + 1);
            
            for(int j = 0; j <= i; j++) {
                // First element and last element in each row are 1
                if(j == 0 || j == i)
                    nums[i][j] = 1;
                else
                    nums[i][j] = nums[i-1][j-1] + nums[i-1][j];
            }
        }

        return nums;
    }
};

int main() {
    Solution sol;
    int numRows = 5; // Example input

    vector<vector<int>> result = sol.generate(numRows);

    // Output the result
    for (const auto& row : result) {
        for (int val : row) {
            cout << val << " ";
        }
        cout << endl;
    }

    return 0;
}
