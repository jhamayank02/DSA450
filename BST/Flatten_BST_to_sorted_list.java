class Node{
    int data;
    Node left, right;

    Node(int data){
        this.data = data;
    }
}

// By changing pointers
// Time complexity O(n) || Space complexity O(height of the BST)
class Flatten_BST_to_sorted_list{

    static Node head;
    static Node prev;

    static void flattenBST(Node root){
        if(root == null){
            return;
        }

        flattenBST(root.left);

        if(prev == null){
            prev = root;
            head = root;
        }
        else{
            prev.right = root;
            prev.left = null;
            prev = root;
        }

        flattenBST(root.right);
    }
    
    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(3);
        root.left.left = new Node(2);
        root.left.right = new Node(4);
        root.right = new Node(7);
        root.right.left = new Node(6);
        root.right.right = new Node(8);

        flattenBST(root);
        
        Node temp = head;
        System.out.print("Flattened BST : ");
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.right;
        }
        System.out.println();
    }
}
