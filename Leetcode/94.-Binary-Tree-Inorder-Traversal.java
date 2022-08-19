// iterative solution 

public List<Integer> inorderTraversal(TreeNode root) {
        // create a arraylist for storing nodes
        ArrayList<Integer> list = new ArrayList<>();
        // create a stack 
        Stack<TreeNode> stack = new Stack<>();
        // cteate a node and assign it to root node
        TreeNode curr = root;
        while(curr != null || !stack.empty()){
            while(curr != null){
                stack.add(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            list.add(curr.val);
            curr = curr.right;
        }
        return list;
    }
