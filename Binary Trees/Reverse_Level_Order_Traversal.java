class Reverse_Level_Order_Traversal{

    public static int findHeight(Node root){
        if(root == null){
            return 0;
        }
        
        int left_height = findHeight(root.left);
        int right_height = findHeight(root.right);
        
        return 1 + Math.max(left_height, right_height);
    }
    
    public static void findLevelOrder(Node root, ArrayList<Integer> arr, int level, int currLevel){
        // currLevel -> Level on which we are currently present
        // level -> Level which we have to find
        if(root == null){
            return;
        }
        
        if(level == currLevel){
            arr.add(root.data);
            return;
        }
        
        findLevelOrder(root.left, arr, level, currLevel+1);
        findLevelOrder(root.right, arr, level, currLevel+1);
    }
    
    public static void addNodesToMap(Node root, int level, HashMap<Integer, ArrayList<Integer>> map){
        if(root == null){
            return;
        }
        
        if(map.containsKey(level)){
            map.get(level).add(root.data);
        }
        else{
            ArrayList<Integer> arr = new ArrayList<>();
            arr.add(root.data);
            map.put(level, arr);
        }
        
        addNodesToMap(root.left, level+1, map);
        addNodesToMap(root.right, level+1, map);
    }
    
    public ArrayList<Integer> reverseLevelOrder(Node node) 
    {
        // Bruteforce Approach
        // Time complexity O(n^2) || Space complexity O(n)
        // ArrayList <Integer> lvlOrder = new ArrayList<Integer>();
        
        // int height = findHeight(node);
        
        // for(int i=height; i>=1; i--){
        //     findLevelOrder(node, lvlOrder, i, 1);
        // }
        
        // return lvlOrder;
        
        
        // Optimal Approach - Using Queue And Stack
        // Time complexity O(n) || Space complexity O(n)
        // Queue<Node> q = new LinkedList<>();
        // Stack<Integer> st = new Stack<>();
        // ArrayList <Integer> lvlOrder = new ArrayList<Integer>();
        // q.add(node);
        
        // while(!q.isEmpty()){
        //     Node front = q.poll();
        //     st.push(front.data);
            
        //     if(front.right != null){
        //         q.add(front.right);
        //     }
        //     if(front.left != null){
        //         q.add(front.left);
        //     }
        // }
        
        // while(!st.isEmpty()){
        //     lvlOrder.add(st.pop());
        // }
        
        // return lvlOrder;
        
        
        
        // Optimal Approach - Using HashMap
        // Time complexity O(n) || Space complexity O(n)
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        ArrayList <Integer> lvlOrder = new ArrayList<Integer>();
        
        addNodesToMap(node, 1, map);
        
        for(int i=map.size(); i>=1; i--){
            for(int a : map.get(i)){
                lvlOrder.add(a);
            }
        }
        
        return lvlOrder;
    }
    
    public static void main(String[] args) {
        
    }
}
