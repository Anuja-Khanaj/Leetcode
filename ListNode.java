public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class RemoveNthNode {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        // Create a dummy node to handle edge cases (e.g., removing the first node)
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        // Initialize two pointers: fast and slow
        ListNode slow = dummy;
        ListNode fast = dummy;

        // Move the fast pointer 'n+1' steps ahead to create a gap of 'n' nodes
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        // Move both pointers until fast reaches the end
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // Remove the nth node by changing the next reference
        slow.next = slow.next.next;

        return dummy.next; // Return the updated list
    }

    // Utility function to print the list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Example 1: [1,2,3,4,5], n = 2 → Output: [1,2,3,5]
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        System.out.print("Original List: ");
        printList(head);
        head = removeNthFromEnd(head, 2);
        System.out.print("After Removal: ");
        printList(head);

        // Example 2: [1], n = 1 → Output: []
        head = new ListNode(1);
        System.out.print("Original List: ");
        printList(head);
        head = removeNthFromEnd(head, 1);
        System.out.print("After Removal: ");
        printList(head);
    }
}
 {
    
}
