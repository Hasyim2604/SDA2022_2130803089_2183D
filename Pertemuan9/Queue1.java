package Pertemuan9;

import java.util.Queue;
import java.util.LinkedList;

public class Queue1 {
  public static void main(String[] args) {
    Queue<String> queue = new LinkedList<String>();

    queue.offer("Abdul");
    queue.offer("Paijo");
    queue.offer("Raya");
    queue.offer("Maria");

    // System.out.println(queue.peek());
    // System.out.println(queue.isEmpty());
    System.out.println(queue.contains(""));
    // System.out.println(queue);
    // System.out.println(queue.size());
  }
}
