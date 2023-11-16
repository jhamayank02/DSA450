class kth_smallest_element_in_BST{
    int k;
    
    int solve(Node root){
        if(root == null){
            return -1;
        }
        
        int left = solve(root.left);
        if(left != -1){
            return left;
        }
        
        k--;
        if(k == 0){
            return root.data;
        }
        
        int right = solve(root.right);
        if(right != -1){
            return right;
        }
        
        return -1;
    }
    
    Node findPredecessor(Node root){
        Node pred = root.left;
        
        while(pred != null && pred.right != root && pred.right != null){
            pred = pred.right;
        }
        
        return pred;
    }
    
    // Return the Kth smallest element in the given BST
    public int KthSmallestElement(Node root, int K) {
        // Using inorder traversal
        // Time complexity O(n) || Space complexity O(n)
        // k = K;
        
        // return solve(root);
        
        // Using morris inorder traversal
        // Time complexity O(n) || Space complexity O(1)
        Node curr = root;
        
        while(curr != null){
            if(curr.left == null){
                K--;
                if(K == 0){
                    return curr.data;
                }
                curr = curr.right;
            }
            else{
                Node pred = findPredecessor(curr);
                if(pred.right == null){
                    pred.right = curr;
                    curr = curr.left;
                }
                else{
                    K--;
                    if(K == 0){
                        return curr.data;
                    }
                    pred.right = null;
                    curr = curr.right;
                }
            }
        }
        
        return -1;
    }

    public static void main(String[] args) {
        
    }
}
