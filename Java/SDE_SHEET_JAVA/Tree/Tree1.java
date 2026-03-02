package SDE_SHEET_JAVA.Tree;

import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
    
    TreeNode(int val,TreeNode left,TreeNode right) {
        this.val = val;
        this.left=left;
        this.right=right;
    }
}


public class Tree1
{
    static TreeNode root;
    public static void preOrder(TreeNode node)
    {
        if(node==null)
            return;

        System.out.print(node.val+"->");
        preOrder(node.left);
        preOrder(node.right);

    }
    public static void inOrder(TreeNode node)
    {
        if(node==null) return;

        inOrder(node.left);
        System.out.print(node.val+"->");
        inOrder(node.right);
    }

     public static void postOrder(TreeNode node)
    {
        if(node==null) return;

        inOrder(node.left);
        inOrder(node.right);
        System.out.print(node.val+"->");
    }

    // Time-Complixity: O(N) it's linear
    public static void leftTreeView(TreeNode node, int level, List<Integer> res){
        if(node == null){
            return;
        }
        
        if(res.size() == level) res.add(node.val);
        
        leftTreeView(node.left, level + 1, res);
        
        leftTreeView(node.right, level + 1, res);
    }

    public static void rightTreeView(TreeNode node, int level, List<Integer> ans)
    {
        if(node==null)
            return;

        if(level==ans.size()) ans.add(node.val);

        rightTreeView(node.right, level+1, ans);
        rightTreeView(node.left, level+1, ans);
        
    }

    
    public static void main(String[] args) {

        root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.right.right=new TreeNode(5);


        System.out.println();
       // preOrder(root);
        inOrder(root);
       
        System.out.println("Left View");
        List<Integer> ans=new ArrayList<>();
        rightTreeView(root,0,ans);
        System.out.println(ans);

        
    }
}
