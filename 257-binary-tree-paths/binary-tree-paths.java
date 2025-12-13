/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        StringBuilder str = new StringBuilder();
        if(root == null){
            return list;
        }
        getTreePath(root,list,str);
        return list;
    }
    private void getTreePath(TreeNode root, List<String> list,StringBuilder str){
        int size = str.length();
        str.append(root.val);
        
        if(root.left == null && root.right == null){
            list.add(str.toString());
        }else{
            str.append("->");
            if(root.left != null){
                getTreePath(root.left,list,str);
            }
            if(root.right != null){
                getTreePath(root.right,list,str);
            }
        }
        str.setLength(size);
    }
}