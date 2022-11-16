package Pertemuan9;

import java.util.LinkedList;

public class LinkedList1 {
  public static void main(String[] args) {
    LinkedList<String> linkedlist = new LinkedList<String>();

    linkedlist.push("M");
    linkedlist.push("I");
    linkedlist.push("Y");
    linkedlist.push("S");
    linkedlist.push("A");
    linkedlist.push("H");
    // linkedlist.pop();
    linkedlist.add(5, "I");
    linkedlist.remove("H");

    System.out.println(linkedlist.peekFirst());
    System.out.println(linkedlist.peekLast());
    // linkedlist.addFirst("A");
    linkedlist.addLast("J");

    // String First = linkedlist.removeFirst();
    // String Last = linkedlist.removeLast();

    System.out.println(linkedlist);
  }
}
