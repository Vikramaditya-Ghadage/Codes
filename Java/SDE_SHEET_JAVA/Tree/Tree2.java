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


public class Tree2 {
    private static List<List<Integer>> result = new ArrayList<>();

    public static void main(String[] args) {
        // Build sample tree: [5,4,8,11,null,13,4,7,2,null,null,5,1]
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);

        int target = 22;
        List<Integer> path = new ArrayList<>();
        findSum(root, target, path);
        System.out.println("Number of paths: " + result.size());
        
        // Print all paths
        for (List<Integer> p : result) {
            System.out.println(p);
        }
        // Output:
        // Number of paths: 2
        // [5, 4, 11, 2]
        // [5, 8, 4, 1]
    }

    public static void findSum(TreeNode root, int target, List<Integer> path) {
        dfs(root, 0, target, path);
        System.out.println(result.size());
    }

    public static void dfs(TreeNode node, int currentSum, int targetSum, List<Integer> path) {
        if (node == null) return;

        currentSum += node.val;
        path.add(node.val);

        // Check if leaf and sum matches
        if (currentSum == targetSum) {
            result.add(new ArrayList<>(path));
        }

        dfs(node.left, currentSum, targetSum, path);
        dfs(node.right, currentSum, targetSum, path);

        path.remove(path.size() - 1);  // Backtrack
    }
}

