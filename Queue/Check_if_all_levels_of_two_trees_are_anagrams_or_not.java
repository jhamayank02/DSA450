import java.util.HashMap;
import java.util.Queue;
import java.util.LinkedList;

class Check_if_all_levels_of_two_trees_are_anagrams_or_not{

    // Using level order traversal
    // Time complexity O(n+m) || Space complexity O(n+m)
    public static boolean checkAnagrams(Node root1, Node root2){
        if((root1 == null && root2 != null) || (root1 != null && root2 == null)){
            return false;
        }
        
        Queue<Node> q1 = new LinkedList<>();
        Queue<Node> q2 = new LinkedList<>();
        
        q1.add(root1);
        q2.add(root2);
        
        while(!q1.isEmpty() || !q2.isEmpty()){
            
            HashMap<Integer, Integer> map = new HashMap<>();
            
            int s1 = q1.size();
            for(int i=0; i<s1; i++){
                Node curr = q1.poll();
                
                if(map.containsKey(curr.data)){
                    map.put(curr.data, map.get(curr.data)+1);
                }
                else{
                    map.put(curr.data, 1);
                }
                
                if(curr.left != null){
                    q1.add(curr.left);
                }
                if(curr.right != null){
                    q1.add(curr.right);
                }
            }
            
            int s2 = q2.size();
            for(int i=0; i<s2; i++){
                Node curr = q2.poll();
                
                if(map.containsKey(curr.data)){
                    if(map.get(curr.data) == 1){
                        map.remove(curr.data);
                    }
                    else{
                        map.put(curr.data, map.get(curr.data)-1);
                    }
                }
                else{
                    return false;
                }
                
                if(curr.left != null){
                    q2.add(curr.left);
                }
                if(curr.right != null){
                    q2.add(curr.right);
                }
            }
            
            if(map.size() > 0 || (q1.isEmpty() && !q2.isEmpty()) || (!q1.isEmpty() && q2.isEmpty())){
                return false;
            }
        }
        
        return true;
    }
    
    public static boolean areAnagrams(Node node1, Node node2) {
        return checkAnagrams(node1, node2);
    }

    public static void main(String[] args) {
        
    }
}
