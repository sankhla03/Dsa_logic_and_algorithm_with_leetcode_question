package linkedlist;

public class Linkedlist {

  public static class Node {
   int data;
   Node next;

   public Node(int var1) {
      this.data = var1;
      this.next = null;
   }
  }

  Node head;

  public void insertbegging(int data) {
    Node newnode = new Node(data);

    if (head == null) {
      head = newnode;
    } else {
      newnode.next = head;
      head = newnode;
    }
  }

  public void insertend(int data) {
    Node newnode = new Node(data);

    if (head == null) {
      head = newnode;
      return;
    }

    Node current = head;
    while (current.next != null) {
      current = current.next;
    }
    current.next = newnode;
    newnode.next = null;
  }

  public void display() {
    Node current = head;

    while (current != null) {
      System.out.print(current.data + " "); 
      current = current.next;
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Linkedlist list = new Linkedlist();
    list.insertbegging(10);
    list.insertbegging(20);
    list.insertbegging(30);
    list.insertend(40);
    list.insertend(50);
    list.display();
  }
}

