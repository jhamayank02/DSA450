class Lowest_Common_Ancestor_in_a_BST{
    
    Node findLCA(Node root, int n1, int n2){
        if(root == null){
            return null;
        }
        
        if(n1 > root.data && n2 > root.data){
            return findLCA(root.right, n1, n2);
        }
        else if(n1 < root.data && n2 < root.data){
            return findLCA(root.left, n1, n2);
        }
        else{
            return root;
        }
    }
    
    //Function to find the lowest common ancestor in a BST. 
	Node LCA(Node root, int n1, int n2)
	{
        // Using Recursion
        // Time complexity O(n) || Space complexity O(n)
        // return findLCA(root, n1, n2);
        
        // Using Loops
        // Time complexity O(n) || Space complexity O(1)
        Node temp = root;
        
        while(temp != null){
            if(n1 > temp.data && n2 > temp.data){
                temp = temp.right;
            }
            else if(n1 < temp.data && n2 < temp.data){
                temp = temp.left;
            }
            else{
                return temp;
            }
        }
        
        return temp;
    }

    public static void main(String[] args) {
        
    }
}
