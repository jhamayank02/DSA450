class Minimum_element_in_BST{
    
    // Time complexity O(n) || Space complexity O(n)
    int minValue(Node root) {
        if(root == null){
            return -1;
        }
        
        if(root.left == null){
            return root.data;
        }
        
        Node temp = root.left;
        
        while(temp.left != null){
            temp = temp.left;
        }
        
        return temp.data;
    }

    public static void main(String[] args) {
        
    }
}
