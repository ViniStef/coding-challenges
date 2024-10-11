package leetcode.easy.removeduplicatesfromsortedlist;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode current = head;
        ListNode fastPointer = current.next;

        while (fastPointer != null) {
            if (current.val != fastPointer.val) {
                current.next = fastPointer;
                current = fastPointer;
                fastPointer = current.next;
            }
            else {
                fastPointer = fastPointer.next;
            }
        }

        current.next = null;

        return head;
    }
}
