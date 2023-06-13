package com.ll;

public class LinkedListBehavior {
  public LinkedListBehavior() {
  }

  public void runTest() {
    LinkedList list = new LinkedList();

    list.add(1);
    list.add(2);
    list.add(3);

    list.display();

    list.remove(2);

    list.display();
  }
}
