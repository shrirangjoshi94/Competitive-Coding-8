package flattenBT;

class Recursive {
    public void flatten(TreeNode root) {

        if(root==null || root.left==null && root.right==null)

            return;

        if(root.left!=null)

        {

            flatten(root.left);

            TreeNode tempright=root.right;

            root.right=root.left;

            root.left=null;

            while(root.right!=null) root=root.right;

            root.right=tempright;

        }

        flatten(root.right);

    }
}