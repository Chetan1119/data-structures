import java.util.*;

class Node {
  int data;
  Node next;

  Node(int data) {
    this.data = data;
  }
}

class Main {
  Node head;

  void add(int d) {
    Node temp = new Node(d);
    if (head == null) {
      head = temp;
    } else {
      Node t = head;
      while (t.next != null)
        t = t.next;
      t.next = temp;
    }
  }

  void display() {
    Node c = head;
    while (c != null) {
      System.out.println(c.data);
      c = c.next;
    }
  }

  public static void main(String[] args) {
    Main obj = new Main();
    Scanner s = new Scanner(System.in);
    System.out.println("enter the number of nodes");
    int n = s.nextInt();
    for (int i = 0; i < n; i++) {
      System.out.println("enter the data part");
      int ump = s.nextInt();
      obj.add(ump);
    }
    obj.display();
  }
}
