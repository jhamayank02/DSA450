class Node {
    int data;
    Node next;
    Node(int value) {
        this.value = value;
    }
}

public class Reverse_a_linked_list {
    Node reverseListRecursive(Node prev, Node curr){
        if(curr == null){
            return prev;
        }
        
        Node next = curr.next;
        curr.next = prev;
        
        return reverseListRecursive(curr, next);
    }
    
    //Function to reverse a linked list.
    Node reverseList(Node head)
    {
        // if(head == null){
        //     return head;
        // }
        
        // Node prev = null;
        // Node curr = head;
        // Node next = null;
        
        // while(curr != null){
        //     next = curr.next;
        //     curr.next = prev;
        //     prev = curr;
        //     curr = next;
        // }
        
        // return prev;
        
        return reverseListRecursive(null, head);
    }

    public static void main(String[] args) {
        
    }
}
