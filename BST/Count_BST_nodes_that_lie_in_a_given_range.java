class Count_BST_nodes_that_lie_in_a_given_range{
    
    int cnt = 0;
    
    void count(Node root, int l, int h){
        if(root == null){
            return;
        }
        
        if(root.data <= h && root.data >= l){
            cnt++;
        }
        
        if(root.data >= l){
            count(root.left, l, h);
        }
        if(root.data <= h){
            count(root.right, l, h);
        }
    }
    
    //Function to count number of nodes in BST that lie in the given range.
    int getCount(Node root,int l, int h)
    {
        // Using recursive inorder traversal
        // Time complexity O(n) || Space complexity O(n)
        cnt = 0;
        count(root, l, h);
        return cnt;
        
        // Using iterative inorder traversal
        // Time complexity O(n) || Space complexity O(n)
        // Stack<Node> st = new Stack<>();
        // Node curr = root;
        
        // while(curr != null || st.size()>0){
            
        //     while(curr != null){
        //         st.push(curr);
        //         curr = curr.left;
        //     }
            
        //     curr = st.pop();
        //     if(curr.data <= h && curr.data >= l){
        //         cnt++;
        //     }
        //     curr = curr.right;
        // }
        
        // return cnt;
    }

    public static void main(String[] args) {
        
    }
}
