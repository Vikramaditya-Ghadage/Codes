//left->root->right
#include<bits/stdc++.h>
using namespace std;
struct TreeNode {
    int data;
    TreeNode *left;
    TreeNode *right;
    TreeNode() :  data(0), left(nullptr), right(nullptr) {}
    TreeNode(int x) : data(x), left(nullptr), right(nullptr) {}
    TreeNode(int x, TreeNode *left, TreeNode *right) : data(x), left(left), right(right) {}
}*root=NULL,*temp=NULL;

void insert(int val)
{
    TreeNode *new_node=new TreeNode(val);
    if(root==NULL)
    {
        root=new_node;
    }
    else
    {
        temp=root;
        while(temp!=NULL)
        {
            if(val>temp->data)
            {
                if(temp->right==NULL)
                break;
                temp=temp->right;
            }
            else
            {
                if(temp->left==NULL)
                break;
                temp=temp->left;
            }
        }
        if(val>temp->data)
        temp->right=new_node;
        else
        temp->left=new_node;
    }
}

// Time-Complixity: O(N) it's linear
bool getNodePath(TreeNode* root, vector<int>& ans, int val) {
    // Base case: If the current
    // node is null, return false
    if (root==NULL) {
        return false;
    }

    // Add the current node's
    // value to the path vector
    ans.push_back(root->data);

    // If the current node's value is equal
    // to the target value 'x', return true
    if (root->data == val) {
        return true;
    }

    // Recursively search for the target value
    // 'x' in the left and right subtrees
    if (getNodePath(root->left, ans, val)
        || getNodePath(root->right, ans, val)) {
        return true;
    }

    // If the target value 'x' is not found
    // in the current path, backtrack
    ans.pop_back();
    return false;
}

int main()
{
    insert(10);
    insert(5);
    insert(15);
    insert(2);
    insert(8);
    insert(12);
    insert(18);
    insert(1);
    insert(7);
    insert(9);

    vector<int> ans;
    int val=1;
    getNodePath(root,ans,val);
    for(auto no:ans)
    cout<<no<<"->";
    cout<<endl;

}