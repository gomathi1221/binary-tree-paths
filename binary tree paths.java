class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> l=new ArrayList<>();
       
        leaf(root,l,"");
        return l;
        
    }
    public void leaf(TreeNode root,List<String> l,String ans){
        if(root==null){
            return;
        }
        if(root.left==null&&root.right==null){
            ans=ans+root.val;
            l.add(ans);
            return;
           
        }
        leaf(root.left,l,ans+root.val+"->");
        leaf(root.right,l,ans+root.val+"->");
    }

}