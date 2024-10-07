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
    TreeNode *new_node = new TreeNode(val);
    
    if (root == NULL)
    {
        root = new_node;
    }
    else
    {
        TreeNode *tmp = root;
        
        while (true) // Continue until a valid position is found
        {
            if (val < tmp->data) 
            {
                if (tmp->left == NULL) 
                {
                    tmp->left = new_node;
                    break;
                }
                tmp = tmp->left;
            }
            else 
            {
                if (tmp->right == NULL)
                {
                    tmp->right = new_node;
                    break;
                }
                tmp = tmp->right; 
            }
        }
    }
}

//root->left->right
// Time-Complixity: O(N) it's linear
void preOrder(TreeNode* current)
{
    if(current==NULL)
    return;
    
    cout<<current->data<<"-->";
    preOrder(current->left);
    preOrder(current->right);          
      
}

//left->root->right
// Time-Complixity: O(N) it's linear
void inOrder(TreeNode* current)
{
    if(current==NULL)
    return;
    
    inOrder(current->left);
    cout<<current->data<<"-->";
    inOrder(current->right);          
      
}

//right->left->root
// Time-Complixity: O(N) it's linear
void postOrder(TreeNode* current)
{
    if(current==NULL)
    return;
    
    postOrder(current->left);
    postOrder(current->right); 
    cout<<current->data<<"-->";         
      
}

// Time-Complixity: O(N) it's linear
void leftTreeView(TreeNode* root, int level, vector<int>& res){
    // Check if the current node is NULL
    if(root == NULL){
        return;
    }
    
    // Check if the size of the result vector
    // is equal to the current level
    if(res.size() == level){
        // If equal, add the value of the
        // current node to the result vector
        res.push_back(root->data);
    }
    
    // Recursively call the function for the
    // left child with an increased level
    leftTreeView(root->left, level + 1, res);
    
    // Recursively call the function for the
    // right child with an increased level
    leftTreeView(root->right, level + 1, res);
}

// Time-Complixity: O(N) it's linear
void rightTreeView(TreeNode* root, int level, vector<int>& res){
    // Check if the current node is NULL
    if(root == NULL){
        return;
    }
    
    // Check if the size of the result vector
    // is equal to the current level
    if(res.size() == level){
        // If equal, add the value of the
        // current node to the result vector
        res.push_back(root->data);
    }

    rightTreeView(root->right, level + 1, res);
    
    // Recursively call the function for the
    // left child with an increased level
    rightTreeView(root->left, level + 1, res);
    
    // Recursively call the function for the
    // right child with an increased level

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
    // preOrder(root);
    // cout<<endl;
    // inOrder(root);
    // cout<<endl;
    // postOrder(root);
    // cout<<endl;

    // vector<int> ans;
    // leftTreeView(root,0,ans);
    // for(auto no:ans)
    // cout<<no<<"->";
    // cout<<endl;


}
