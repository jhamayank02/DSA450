class Node {
    int data;
    Node next;
    Node(int value) {
        this.value = value;
    }
}

public class Detect_Loop_in_linked_list {
    public static boolean detectLoop(Node head){
        if(head == null || head.next == null){
            return false;
        }
        
        Node slow = head;
        Node fast = head.next;
        
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
            if(fast != null){
                fast = fast.next;
            }
            
            if(fast == slow){
                return true;
            }
        }
        
        return false;
    }

    public static void main(String[] args) {
        
    }
}
