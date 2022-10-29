import java.util.*;
public class Solution700 {
    public class TreeNode {
     int val;
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
 public Solution700(){}
    List<Integer> tree = new ArrayList();
    protected TreeNode searchBST(TreeNode root, int val) {
//        Solution700 a=new Solution700();
//        if(root==null){
//            return (TreeNode) tree;
//        }
//        TreeNode start = find(root,val);
//        if(start==null){
//            return (TreeNode) tree;
        //本题最大的特色在于你searchBST的结果直接return那个点就行，他的子数用点本身就可以做出来。
        //详情参考RBTree的tostring算法。
        if(root == null || root.val==val){return root;}
        return root.left.val < val ? searchBST(root.left,val):searchBST(root.right,val);
        }

    }
//    protected void find(TreeNode root, int val){
//        if(val==root.val){
//            return root;
//        }
//        else if(val < root.val){
//            return find(root.left,val);
//        }
//        else {return find(root.right,val);}
//    }
//
//    public void add(TreeNode node, int val){
//        if(val==node.left.val){
//            tree.add(node.left.val);
//        }
//        if(val==node.right.val){
//            tree.add(node.right.val);
//        }
//    }

