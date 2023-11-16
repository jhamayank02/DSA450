import java.util.ArrayList;
import java.util.HashMap;

class Brothers_From_Different_Roots{
    
    static void findInorder(Node root, ArrayList<Integer> inorder){
        if(root == null){
            return;
        }
        
        findInorder(root.left, inorder);
        inorder.add(root.data);
        findInorder(root.right, inorder);
    }
    
    static void findInorderMap(Node root, HashMap<Integer, Boolean> inorder){
        if(root == null){
            return;
        }
        
        findInorderMap(root.left, inorder);
        inorder.put(root.data, true);
        findInorderMap(root.right, inorder);
    }
    
	public static int countPairs(Node root1, Node root2, int x)
	{
	    // Using inorder traversal of both the tree and 2 pointers approach
	    // Time complexity O(m+n) || Space complexity O(m+n)
        // 		ArrayList<Integer> inorder1 = new ArrayList<>();
        // 		ArrayList<Integer> inorder2 = new ArrayList<>();
                
        // 		findInorder(root1, inorder1);
        // 		findInorder(root2, inorder2);
                
        // 		int m = inorder1.size();
        // 		int n = inorder2.size();
        // 		int i = m-1;
        // 		int j = 0;
        // 		int pairsCnt = 0;
                
        // 		while(i>=0 && j<n){
        // 		    int sum = inorder1.get(i) + inorder2.get(j);
                    
        // 		    if(sum < x){
        // 		        j++;
        // 		    }
        // 		    else if(sum > x){
        // 		        i--;
        // 		    }
        // 		    else{
        // 		        pairsCnt++;
        // 		        i--;
        // 		        j++;
        // 		    }
        // 		}
                
        // 		return pairsCnt;



	    // Using inorder traversal and hashmap
	    // Time complexity O(m+n) || Space complexity O(m+n)
		ArrayList<Integer> inorder = new ArrayList<>(); // Inorder of BST1
		findInorder(root1, inorder);
		
		HashMap<Integer, Boolean> map = new HashMap<>(); // Elements of BST2
		findInorderMap(root2, map);
		
		int pairs = 0;
		for(int i=0; i<inorder.size(); i++){
		    int req = x - inorder.get(i);
		    
		    if(map.containsKey(req)){
		        pairs++;
		    }
		}
		
		return pairs;
	}

    public static void main(String[] args) {
        
    }
}
