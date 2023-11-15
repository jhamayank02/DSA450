public class Kth_largest_element_in_BST {
    
    int k;
    
    int solve(Node root){
        if(root == null){
            return -1;
        }
        
        int right = solve(root.right);
        if(right != -1){
            return right;
        }
        
        k--;
        if(k == 0){
            return root.data;
        }
        
        int left = solve(root.left);
        if(left != -1){
            return left;
        }
        
        return -1;
    }
    
    Node findPredecessor(Node root){
        Node pred = root.left;
        
        while(pred != null && pred != root && pred.right != null){
            pred = pred.right;
        }
        
        return pred;
    }
    
    // return the Kth largest element in the given BST rooted at 'root'
    public int kthLargest(Node root,int K)
    {
        // Using reverse inorder traversal
        // Time complexity O(n) || Space complexity O(n)
        // k = K;
        
        // return solve(root);
        
        
        
        Node curr = root;
        
        while(curr != null){
            if(curr.left == null){
                K--;
                if(K == 0){
                    return curr.data;
                }
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
