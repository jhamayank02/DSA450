class Level_order_traversal{

    public static int findHeight(Node root){
        if(root == null){
            return 0;
        }
        
        int left_height = findHeight(root.left);
        int right_height = findHeight(root.right);
        
        return 1 + Math.max(left_height, right_height);
    }
    
    public static void findLevelOrder(Node root, ArrayList<Integer> arr, int level){
        if(root == null){
            return;
        }
        
        if(level-1 == 0){
            arr.add(root.data);
            return;
        }
        
        findLevelOrder(root.left, arr, level-1);
        findLevelOrder(root.right, arr, level-1);
    }
    
    //Function to return the level order traversal of a tree.
    static ArrayList <Integer> levelOrder(Node node) 
    {
        // Bruteforce Approach
        // Time complexity O(n^2) || Space complexity O(n)
        // ArrayList <Integer> lvlOrder = new ArrayList<Integer>();
        
        // int height = findHeight(node);
        
        // for(int i=1; i<=height; i++){
        //     findLevelOrder(node, lvlOrder, i);
        // }
        
        // return lvlOrder;
        
        
        
        
        // Optimal Approach - Using Queue
        // Time complexity O(n) || Space complexity O(n)
        Queue<Node> q = new LinkedList<>();
        ArrayList <Integer> lvlOrder = new ArrayList<Integer>();
        q.add(node);
        
        while(!q.isEmpty()){
            Node front = q.poll();
            
            lvlOrder.add(front.data);
            
            if(front.left != null){
                q.add(front.left);
            }
            if(front.right != null){
                q.add(front.right);
            }
            
        }
        
        return lvlOrder;
    }
    
    public static void main(String[] args) {
        
    }
}
