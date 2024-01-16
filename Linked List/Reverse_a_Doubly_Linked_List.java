class Node{
    int data;
    Node next, prev;
    Node(int data)
    {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}


public class Reverse_a_Doubly_Linked_List {
    public static Node reverseDLL(Node  head){
        Node curr = head;
        Node prev = null;
        Node next;
        
        while(curr != null){
            next = curr.next;
            
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        
        return prev;
    }

    public static void main(String[] args) {
        
    }
}
