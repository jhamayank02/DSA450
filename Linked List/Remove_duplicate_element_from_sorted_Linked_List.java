class Node{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

public class Remove_duplicate_element_from_sorted_Linked_List {
    Node removeDuplicates(Node head)
    {
	    if(head == null || head.next == null){
	        return head;
	    }
	    
	    Node curr = head;
	    Node next = null;
	    
	    while(curr != null){
	        next = curr.next;
	        
	        if(next != null && curr.data == next.data){
	            curr.next = next.next;
	        }
	        else{
	            curr = curr.next;
	        }
	    }
	    
	    return head;
    }

    public static void main(String[] args) {
        
    }
}
