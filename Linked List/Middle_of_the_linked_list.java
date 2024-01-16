public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Middle_of_the_linked_list {
    int findLength(ListNode head){
        int len = 0;
        ListNode temp = head;

        while(temp != null){
            temp = temp.next;
            len++;
        }

        return len;
    }

    public ListNode middleNode(ListNode head) {
        
        int len = findLength(head);
        int mid = (len/2) + 1;

        ListNode temp = head;
        while(mid > 1){
            temp = temp.next;
            mid--;
        }

        return temp;

    }

    public static void main(String[] args) {
        
    }
}
