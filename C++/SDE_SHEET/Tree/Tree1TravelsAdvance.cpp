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
void levelOrderTravel(TreeNode* current,vector<vector<int>> &ans)
{
    if(current==NULL)
    return;
    queue<TreeNode*> q;
    q.push(current);

    while(!q.empty())
    {
        vector<int> level;
        int size = q.size(); 

        for (int i = 0; i < size; i++) 
        {
            TreeNode* node=q.front();
            q.pop();
            level.emplace_back(node->data);
            if(node->left!=NULL)
            {
                q.push(node->left);
            }

            if(node->right!=NULL)
            {
                q.push(node->right);
            }
        }
        ans.emplace_back(level);

    }
}

// Time-Complixity: O(N) it's linear
void zigZagOrderTravel(TreeNode* current,vector<vector<int>> &ans)
{
    bool leftToright=true;
    if(current==NULL)
    return;
    queue<TreeNode*> q;
    q.push(current);

    while(!q.empty())
    {
        int size = q.size(); 
        vector<int> level(size);
        for (int i = 0; i < size; i++) 
        {
            TreeNode* node=q.front();
            q.pop();
            int index=leftToright?i:(size-1-i);
            level[index]=node->data;
            if(node->left!=NULL)
            {
                q.push(node->left);
            }

            if(node->right!=NULL)
            {
                q.push(node->right);
            }

        }
        leftToright=!leftToright;
        ans.emplace_back(level);

    }

}

// Time-Complixity: O(N log N)
void verticalOrdertravel(TreeNode* current, int hd,
                      map<int, vector<int> >& mp)
{
    // Base case
    if (current == NULL)
        return;
 
    // Store current node in map 'm'
    mp[hd].push_back(current->data);
 
    // Store nodes in left subtree
    verticalOrdertravel(current->left, hd - 1, mp);
 
    // Store nodes in right subtree
    verticalOrdertravel(current->right, hd + 1, mp);
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

    vector<vector<int>> ans;
    levelOrderTravel(root,ans);
    for(auto i:ans)
    {
        for(auto j:i)
        cout<<j<<" ";
        cout<<endl;
    }

    //vector<vector<int>> ans;
    ans.clear();
    zigZagOrderTravel(root,ans);
    for(auto i:ans)
    {
        for(auto j:i)
        cout<<j<<" ";
        cout<<endl;
    }


    // map<int, vector<int> > mp;

    // int hd = 0;
    // verticalOrdertravel(root, hd, mp);
    // for (auto m:mp) {
    //     for (int i = 0; i < m.second.size(); ++i)
    //         cout << m.second[i] << " ";
    //     cout << endl;
    // }
}