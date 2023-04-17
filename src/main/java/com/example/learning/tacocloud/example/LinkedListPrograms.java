package com.example.learning.tacocloud.example;

public class LinkedListPrograms {

    public static void main(String[] args) {
        ListNode newNode1 = new ListNode('A');
        ListNode newNode2 = new ListNode('B');
        ListNode newNode3 = new ListNode('C');
        ListNode newNode4 = new ListNode('D');
        newNode1.next = newNode2;
        newNode2.next = newNode3;
        newNode3.next = newNode4;
        newNode4.next = null;
        ListNode reversedList = reverse(newNode1);
        printList(reversedList);
    }

    public static ListNode reverse(ListNode head) {
        ListNode current = head;
        ListNode prev = null;

        while(current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public static void printList(ListNode head) {
        ListNode temp = head;
        while(temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
}
