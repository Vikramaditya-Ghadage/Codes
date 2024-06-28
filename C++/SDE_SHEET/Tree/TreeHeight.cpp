                            
#include <iostream>
#include <algorithm>
#include <climits>
using namespace std;
// TreeNode structure for the binary tree
struct TreeNode {
    int data;
    TreeNode* left;
    TreeNode* right;
    // Constructor to initialize
    // the node with a value
    TreeNode(int val) : data(val), left(NULL), right(NULL) {}
};

// Time-Complixity: O(N) it's linear
int calculateHeight(TreeNode* node)
{
    if(node==NULL)
    return 0;

    int lh=calculateHeight(node->left);
    int rh=calculateHeight(node->right);

    return max(lh,rh)+1;
}

// Time-Complixity: O(N) it's linear
int calculateDiameter(TreeNode* node,int &diameter)
{
    if(node==NULL)
    return 0;

    int lh=calculateDiameter(node->left,diameter);
    int rh=calculateDiameter(node->right,diameter);

    diameter=max(diameter,lh+rh);

    return max(lh,rh)+1;
}

// Time-Complixity: O(N) it's linear
int dfsHeight(TreeNode* node)
{
    if(node==NULL)
    return 0;

    int lh=dfsHeight(node->left);
    if(lh==-1)
    return -1;

    int rh=dfsHeight(node->right);
    if(rh==-1)
    return -1;

    if(abs(lh-rh)>1)
    return -1;

    return max(lh,rh)+1;
}

bool isBalanced(TreeNode* node) {
    // Check if the height difference between subtree's are not greater than 1 If yes, return false; otherwise, return true
    return dfsHeight(node) != -1;
}

// Time-Complixity: O(N) it's linear
TreeNode* lowestCommonAncestor(TreeNode* node, TreeNode* p, TreeNode* q) 
{
    //base case
    if (node == NULL || node == p || node == q) {
        return node;
    }

    TreeNode* left = lowestCommonAncestor(node->left, p, q);
    TreeNode* right = lowestCommonAncestor(node->right, p, q);

    //result
    if(left == NULL) 
        return right;
    else if(right == NULL)
        return left;
    else 
        return node;
}

bool isIdentical(TreeNode* node1, TreeNode* node2){
    if(node1 == NULL && node2 == NULL)
        return true;
    
    if( node1== NULL || node2==NULL)
    return false;

    // Check if the current nodes have the same data value and recursively check their left and right subtrees
    return ((node1->data == node2->data) && isIdentical(node1->left, node2->left)
            && isIdentical(node1->right, node2->right));
}

int main() {

    TreeNode* root = new TreeNode(10);
    root->left = new TreeNode(5);
    root->right = new TreeNode(15);
    root->left->left = new TreeNode(2);
    root->left->right = new TreeNode(8);
    root->right->left = new TreeNode(12);
    root->right->right = new TreeNode(18);
    root->left->left->left = new TreeNode(1);
    root->left->right->left = new TreeNode(7);
    root->left->right->right = new TreeNode(9);
    root->right->left->left = new TreeNode(11);

    // cout << "Height is: "<<calculateHeight(root)<<endl;

    // int diameter=0;
    // calculateDiameter(root,diameter);
    // cout << "Diameter is:"<<diameter<<endl;

    // if(isBalanced(root))
    // cout << "The tree is balanced." << endl;
    // else
    // cout << "The tree is not balanced." << endl;

    cout << "Lowest Common Ancestor is:"<<lowestCommonAncestor(root,root->left,root->right)->data<<endl;

    // TreeNode* root1 = new TreeNode(1);
    // root1->left = new TreeNode(2);
    // root1->right = new TreeNode(3);
    // root1->left->left = new TreeNode(5);

    // // Node2
    // TreeNode* root2 = new TreeNode(1);
    // root2->left = new TreeNode(2);
    // root2->right = new TreeNode(3);
    // root2->left->left = new TreeNode(4);

    // if (isIdentical(root1, root2))
    // cout << "The binary trees are identical." << endl;
    // else
    // cout << "The binary trees are not identical." << endl;
}
                            
                        