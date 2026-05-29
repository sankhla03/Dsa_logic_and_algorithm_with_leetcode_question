package linkedlist;

import java.util.LinkedList;
public class ll_calection {

  public static void main(String[] args) {
      LinkedList<Integer> list = new LinkedList<>();
      list.add(2);
      list.addFirst(1);
      list.addLast(3);
      list.add(3, 4);
      System.out.println(list);
      list.removeFirst();
      list.removeLast();
      System.out.println(list);

      System.out.println(list.peek());
      System.out.println(list.getLast());
      System.out.println(list.size());

      System.out.println(list.contains(6));

  }
  
}
