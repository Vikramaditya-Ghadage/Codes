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

int findMaxPathSum(TreeNode* root, int &maxi) 
{
    if (root == NULL) {
        return 0;
    }

    // Calculate the maximum path sum
    // for the left and right subtrees
    int lh = max(0, findMaxPathSum(root->left, maxi));
    int rh = max(0, findMaxPathSum(root->right, maxi));

    maxi = max(maxi, lh + rh + root->data);
    return max(lh, rh) + root->data;
}

bool isSymmetricUtil(TreeNode* root1, TreeNode* root2)
{
        // If one subtree is NULL, the other must also be NULL for symmetry
    if (root1 == NULL || root2 == NULL)
    return root1 == root2;
    
    // Check if the data in the current nodes is equal and recursively check for symmetry in subtrees
    return (root1->data == root2->data) && isSymmetricUtil(root1->left, root2->right)
        && isSymmetricUtil(root1->right, root2->left);
}

bool isSymmetric(TreeNode* root) 
{
    if (root==NULL)
    return true;

    // Call the utility function to check symmetry of subtrees
    return isSymmetricUtil(root->left, root->right);
}

int main()
{
    TreeNode* root = new TreeNode(-10);
    root->left = new TreeNode(9);
    root->right = new TreeNode(20);
    root->right->left = new TreeNode(15);
    root->right->right = new TreeNode(7);

    int maxi = INT_MIN;
    findMaxPathSum(root, maxi);
    cout << "Maximum Path Sum: " << maxi << endl;

    if(isSymmetric(root))
    cout << "This Tree is Symmetrical" << endl; 
    else
    cout << "This Tree is NOT Symmetrical" << endl;
}
