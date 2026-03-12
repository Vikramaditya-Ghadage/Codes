package SDE_SHEET_JAVA.bfs;

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

public class TreeSearch {
    static TreeNode root;

    public static void inOrder(TreeNode node)
    {
        if(node==null) return;

        inOrder(node.left);
        System.out.print(node.val+"->");
        inOrder(node.right);
    }

    public static void levelOrderTravel(TreeNode node)
    {
        if(node==null)
            return;
        Queue<TreeNode> queue=new ArrayDeque<>();
        queue.add(node);
        List<List<Integer>> ans=new ArrayList<>();
        while(!queue.isEmpty())
        {
            int size=queue.size();
            List<Integer> level=new ArrayList<>();
            for(int i=1;i<=size;i++)
            {
                TreeNode currentNode=queue.poll();
                level.add(currentNode.val);

                if(currentNode.left!=null)
                    queue.add(currentNode.left);
                if(currentNode.right!=null)
                    queue.add(currentNode.right);

            }
            ans.add(level);

        }

        for(int i=0;i<ans.size();i++)
        {
            System.out.println(ans.get(i));
        }
    }
    public static void main(String[] args) {
        root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.right.right=new TreeNode(5);
        root.left.right=new TreeNode(6);
        root.right.right.right=new TreeNode(7);


        // inOrder(root);
        levelOrderTravel(root);
    }
}
