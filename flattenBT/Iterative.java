package flattenBT;

class Iterative {
    public void flatten(TreeNode root) {

        if(root == null) {
            return;
        }

        Stack<TreeNode> stack = new Stack();
        stack.push(root);

        while(!stack.isEmpty()) {
            TreeNode curr = stack.pop();

            if(curr.right != null) {
                stack.push(curr.right);
            }

            if(curr.left != null) {
                stack.push(curr.left);
            }

            if(!stack.isEmpty()) {
                curr.right = stack.peek();
            }
            curr.left = null;
        }
    }
}