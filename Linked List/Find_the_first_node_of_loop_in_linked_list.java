class Node{
    int data;
    Node next;
    
    Node(int x)
    {
        data = x;
        next = null;
    }
}

public class Find_the_first_node_of_loop_in_linked_list {
    public static int findFirstNode(Node head){
        
        if(head == null){
            return -1;
        }
        
        Node slow = head;
        Node fast = head.next;
        
        while(fast != null){
            if(slow == fast){
                break;
            }
            
            slow = slow.next;
            fast = fast.next;
            if(fast != null){
                fast = fast.next;
            }
        }
        
        if(fast == null){
            return -1;
        }
        
        slow = head;
        
        while(fast.next != slow){
            slow = slow.next;
            fast = fast.next;
        }
        
        return slow.data;
    }

    public static void main(String[] args) {
        
    }
}
