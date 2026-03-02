package SDE_SHEET_JAVA.Tree;

import java.util.*;

public class TreeHeight {
    static TreeNode root;
    public static void inOrder(TreeNode node)
    {
        if(node==null) return;

        inOrder(node.left);
        System.out.print(node.val+"->");
        inOrder(node.right);
    }

    public static int calLeftHeight(TreeNode node)
    {
        if(node==null) return 0;
        
        int lh=calLeftHeight(node.left);
        System.out.println(node.val+" "+lh);
        
        return lh+1;
    }

    public static void findSum(TreeNode node,int currentSum,List<Integer>path,int target)
    {
        if(node==null) return;
        currentSum+=node.val;
        path.add(node.val);

        if(target==currentSum)
        {
            System.out.println(path);
         //   path=new ArrayList<>();
        }
        
        System.err.println("sum:"+currentSum);
        findSum(node.left,currentSum,path,target);
        findSum(node.right,currentSum,path,target);
        path.remove(path.size()-1);

        
    }

    public static int calHeight(TreeNode node)
    {
        if(node==null) return 0;

        int lh=calHeight(node.left);
        int rh=calHeight(node.right);

        return Math.max(lh,rh)+1;
    }

    public static void main(String[] args) {
        
        root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.right.right=new TreeNode(5);
        // root.left.left.left=new TreeNode(6);
        // root.right.right.right=new TreeNode(7);
        // root.right.right.right.right=new TreeNode(8);
        //  root.right.right.right.right.right=new TreeNode(9);

        //System.out.println(calLeftHeight(root));
        List<Integer> path=new ArrayList<>();
        findSum(root, 0, path,3);

        
    }
    
}
