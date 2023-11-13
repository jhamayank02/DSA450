class Predecessor_and_Successor{
    static Node pre = null;
    static Node suc = null;

    static Node findPredecessor(Node root){
        Node temp = root.left;
        
        while(temp.right != null){
            temp = temp.right;
        }
        
        return temp;
    }
    
    static Node findSuccessor(Node root){
        Node temp = root.right;
        
        while(temp.left != null){
            temp = temp.left;
        }
        
        return temp;
    }
    
    public static void find(Node root, int key){
        if(root == null){
            return;
        }
        
        if(root.data > key){
            suc = root;
            find(root.left, key);
        }
        else if(root.data < key){
            pre = root;
            find(root.right, key);
        }
        else{
            if(root.right != null){
                suc = findSuccessor(root);
            }
            if(root.left != null){
                pre = findPredecessor(root);
            }
        }
        return;
    }
    
    // Time complexity O(n) || Space complexity O(n)
    public static void findPreSuc(Node root, int key)
    {
        if(root == null){
            return;
        }
        
        pre = null;
        suc = null;
        
        find(root, key);
    }

    public static void main(String[] args) {
        
    }
}
