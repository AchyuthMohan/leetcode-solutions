
class Solution {
    public static boolean isIdentical(TreeNode leftNode,TreeNode rightNode){
        if(rightNode==null&&leftNode==null){
            return true;

        }
        if(leftNode==null||rightNode==null){
            return false;
        }
        if(rightNode.val==leftNode.val){
            return isIdentical(leftNode.left,rightNode.right)&&isIdentical(leftNode.right,rightNode.left);
        }
        return false;
    }
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        if(root.right==null&&root.left==null){
            return true;
        }
        if(root.right==null||root.left==null){
            return false;
        }
        
        // return isSymmetric(root.left) && isSymmetric(root.right);
        return isIdentical(root.left,root.right);
        
    }
}