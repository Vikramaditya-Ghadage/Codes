 #include<bits/stdc++.h>
using namespace std;
 int solution(Tree* T) {
        unordered_set<int> uniqueNumbers;
        if (T != nullptr) {
            vector<int> path;
            dfs(T, path, uniqueNumbers);
        }
        return uniqueNumbers.size();
    }

private:
    void dfs(Tree* node, vector<int>& path, unordered_set<int>& uniqueNumbers) {
        if (node == nullptr) {
            return;
        }

        // Add current node to the path
        path.push_back(node->value);

        // If we have a three-digit path, form the number and add to set
        if (path.size() >= 3) {
            int num = path[path.size() - 3] * 100 + path[path.size() - 2] * 10 + path[path.size() - 1];
            uniqueNumbers.insert(num);
        }

        // Continue DFS traversal
        dfs(node->left, path, uniqueNumbers);
        dfs(node->right, path, uniqueNumbers);

        // Backtrack to allow other paths
        path.pop_back();
    }