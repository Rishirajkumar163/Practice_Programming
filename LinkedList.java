import java.util.*;
class LinkedList {
    static class node {
        int data;
        node next;

        public node(int data)
        {
            this.data = data;
        }
    }
    static void removeDuplicate(node head)
    {
        HashSet<Integer> set = new HashSet<>();
        node current = head;
        node prev = null;
        while (current != null) {
            int num = current.data;
            if (set.contains(num))
                prev.next = current.next;
            else {
                set.add(num);
                prev = current;
            }
            current = current.next;
        }
    }
    static void printList(node head)
    {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args)
    {

        node first = new node(1);
        first.next = new node(1);
        first.next.next = new node(3);
        first.next.next.next = new node(4);
        first.next.next.next.next = new node(4);
        first.next.next.next.next.next = new node(4);
        first.next.next.next.next.next.next = new node(5);

         removeDuplicate(first);
        printList(first);
    }}