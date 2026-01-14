package com.sayali.practice.LinkedListCycle;

public class LinkedListCycle {

    // Definition for singly-linked list
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // Fast & Slow Pointer method
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;           // move 1 step
            fast = fast.next.next;     // move 2 steps

            if (slow == fast) {
                return true;            // cycle detected
            }
        }

        return false;                   // no cycle
    }

    public static void main(String[] args) {
        LinkedListCycle solution = new LinkedListCycle();

        // ---------- Test Case 1: Cycle exists ----------
        ListNode head1 = new ListNode(3);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(0);
        head1.next.next.next = new ListNode(-4);

        // create cycle: last node points to second node
        head1.next.next.next.next = head1.next;

        System.out.println("Has Cycle (expected true): " + solution.hasCycle(head1));

        // ---------- Test Case 2: No cycle ----------
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);

        System.out.println("Has Cycle (expected false): " + solution.hasCycle(head2));
    }
}
