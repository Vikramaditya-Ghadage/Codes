#include<bits/stdc++.h>

using namespace std;

// Function to shrink the array by removing consecutive repeating elements
vector<string> shrinkArray(vector<string>& arr, int burstLength) {
    int n = arr.size();
    bool shrinked = true;

    while (shrinked) {
        shrinked = false;
        vector<string> result;
        
        for (int i = 0; i < n;) {
            int count = 1;

            // Count consecutive elements
            while (i + count < n && arr[i] == arr[i + count]) {
                count++;
            }

            // If the count is less than burstLength, keep these elements
            if (count < burstLength) {
                for (int j = 0; j < count; j++) {
                    result.push_back(arr[i]);
                }
            } else {
                // If we remove elements, mark shrink as true
                shrinked = true;
            }

            // Move to the next group of elements
            i += count;
        }

        // If shrinking happened, update the array with the new result
        if (shrinked) {
            arr = result;
            n = arr.size(); // Update size after shrinkage
        }
    }

    return arr;
}

int main() {
    int n, burstLength;
    cin >> n;

    vector<string> arr(n);
    for (int i = 0; i < n; i++) {
        cin >> arr[i];  // Read the input strings
    }

    cin >> burstLength;

    // Get the final shrunk array
    vector<string> result = shrinkArray(arr, burstLength);

    // Output the result
    for (const string& s : result) {
        cout << s << endl;
    }

    return 0;
}
