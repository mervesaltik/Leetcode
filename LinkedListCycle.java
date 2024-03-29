/* Example 1 : Input : head = [3,2,0,-4], pos = 1
 * Output : true
 * Explanation : There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).
 * 
 * Example 2 : Input : head = [1,2], pos = 0
 * Output : true
 * Explanation : There is a cycle in the linked list, where the tail connects to the 0th node.
 * 
 * Example 3 : Input : head = [1], pos = -1
 * Output : false
 * Explanation : There is no cycle in the linked list.*/

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
        
    }	
}
