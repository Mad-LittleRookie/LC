import java.util.*;
//sdsadfaf
class Solution94 {
    protected class Solution {
        public class TreeNode {
            int val;
            int jj;
            int gg;
            int c;
            TreeNode left;
            TreeNode right;
            TreeNode() {}
            TreeNode(int val) { this.val = val; }
            TreeNode(int val, TreeNode left, TreeNode right) {
                this.val = val;
                this.left = left;
                this.right = right;
            }
        }
    }
    public List<Integer> inorderTraversal(Solution.TreeNode root) {
        List<Integer> output = new ArrayList<>();
        add(root,output);
        return output;
    }
    protected void add(Solution.TreeNode root, List<Integer> output){
        if(root != null){
            add(root.left,output);
            output.add(root.val);

            add(root.right,output);
        }

    }
}