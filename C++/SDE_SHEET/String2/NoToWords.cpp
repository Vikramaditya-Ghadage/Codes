#include <bits/stdc++.h>
using namespace std;

// Arrays to store word equivalents of numbers
string one[] = { "", "one ", "two ", "three ", "four ",
                 "five ", "six ", "seven ", "eight ",
                 "nine ", "ten ", "eleven ", "twelve ",
                 "thirteen ", "fourteen ", "fifteen ",
                 "sixteen ", "seventeen ", "eighteen ",
                 "nineteen " };

string ten[] = { "", "", "twenty ", "thirty ", "forty ",
                 "fifty ", "sixty ", "seventy ", "eighty ",
                 "ninety "};

// Function to convert a number into words
string noToWord(int no, string s) {
    string ans;
    if (no > 19)
        ans += ten[no / 10] + one[no % 10];
    else
        ans += one[no];

    if (no)
    ans += s;
    
    return ans;
}

// Function to convert a large number to words
string convertToString(long no) {
    string ans;

    // Vectors for place values and their corresponding names
    vector<int> num = {10000000, 100000, 1000, 100};
    vector<string> place = {"crore ", "lakh ", "thousand ", "hundred "};

    // Loop through the vectors to construct the result
    for (int i = 0; i < num.size(); i++) {
        ans += noToWord(no / num[i], place[i]);
        no %= num[i];  // Update the number after each place value is processed
    }

    // Adding "and" if necessary (when there is a remainder below 100 and it's not part of a "hundred")
    if (no) {
        ans += "and ";
    }

    // Process the last two digits (1s and 10s place)
    ans += noToWord(no, "");

    return ans;
}

int main() {
    long no = 128836442;  // Example number
    cout << convertToString(no) << endl;
    return 0;
}
