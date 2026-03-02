package SDE_SHEET_JAVA.Tree;

import java.util.*;

public class TreeTravelAdvance {
    static TreeNode root;

    public static void inOrder(TreeNode node)
    {
        if(node==null) return;

        inOrder(node.left);
        System.out.print(node.val+"->");
        inOrder(node.right);
    }

    public static void levelOrderTravel(TreeNode node,List<List<Integer>> ans)
    {
        if(node==null)
            return;
        Queue<TreeNode> queue=new ArrayDeque<>();
        queue.offer(node);

        while(!queue.isEmpty())
        {
            List<Integer> level=new ArrayList<>();
            int size=queue.size();
            for(int i=0;i<size;i++)
            {
                TreeNode currNode=queue.poll();
                level.add(currNode.val);
                if(currNode.left!=null)
                    queue.offer(currNode.left);
                if(currNode.right!=null)
                    queue.offer(currNode.right);

            }
            ans.add(level);
        }

    }
    public static void zigZagTravel(TreeNode node,List<List<Integer>> ans)
    {
        if(root==null) return;
        Queue<TreeNode> queue=new ArrayDeque<>();
        queue.add(node);

        while(!queue.isEmpty())
        {   
            int size=queue.size();
            List<Integer> level=new ArrayList<>();
            for(int i=0;i<size;i++)
            {
                TreeNode currentNode=queue.poll();
                int index=(i%2==1)?(size-i-1):(i);
                level.add(index, currentNode.val);
                if(currentNode.left!=null)
                {
                    queue.add(currentNode.left);
                }
                if(currentNode.right!=null)
                {
                    queue.add(currentNode.right);
                }

            }
            ans.add(level);
        }
    }
    public static void travelVertical(TreeNode node,int level,TreeMap<Integer,List<Integer>> map)
    {
        if(node==null)
            return;
        if(!map.containsKey(level))
        {
            map.put(level,new ArrayList<>());
        }
        map.get(level).add(node.val);
        travelVertical(node.left,level-1,map);
        travelVertical(node.right,level+1,map);
    }

    public static void main(String[] args) {

        root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.right.right=new TreeNode(5);
        root.left.left.left=new TreeNode(6);
        root.right.right.right=new TreeNode(7);

        System.out.println();
        List<List<Integer>> ans=new ArrayList<>();
        zigZagTravel(root,ans);

        System.out.println(ans);

        // TreeMap<Integer,List<Integer>> map=new TreeMap<>();
        // travelVertical(root,0,map);

        // System.out.println(map);
        // map.forEach((k,v)->
        // {
        //     System.out.println(v);
        // });

    }
}
