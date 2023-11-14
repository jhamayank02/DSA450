class Populate_Inorder_Successor_for_all_nodes{
    void findInorder(Node root, ArrayList<Node> inorder){
        if(root == null){
            return;
        }
        
        findInorder(root.left, inorder);
        inorder.add(root);
        findInorder(root.right, inorder);
    }
    
    Node findSuccessor(Node root){
        Node temp = root;
        
        while(temp.left != null){
            temp = temp.left;
        }
        
        return temp;
    }
    
    void inorder(Node root, Node succ){
        if(root == null){
            return;
        }
        
        inorder(root.left, root);
        
        if(root.right == null){
            root.next = succ;
        }
        else{
            root.next = findSuccessor(root.right);
        }
        
        inorder(root.right, succ);
    }
    
    Node next = null;
    
    public void populateNext(Node root){
        // Using Auxiliary Array
        // Time complexity O(n) || Space complexity O(n)
        // ArrayList<Node> inorder = new ArrayList<>();
        // findInorder(root, inorder);
        
        // int n = inorder.size();
        // for(int i=0; i<n-1; i++){
        //     Node curr = inorder.get(i);
        //     Node nextNode = inorder.get(i+1);
        //     curr.next = nextNode;
        // }
        
        // Node lastNode = inorder.get(n-1);
        // lastNode.next = null;
        
        
        // Using Recursion
        // Time complexity O(n) || Space complexity O(n)
        // inorder(root, null);
        
        
        // Using Recursion - Optimal Approach
        // Time complexity O(n) || Space complexity O(n)
        if(root == null){
            return;
        }
        
        populateNext(root.right);
        
        root.next = next;
        next = root;
        
        populateNext(root.left);
        
    }

    public static void main(String[] args) {
        
    }
}
