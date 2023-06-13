package com.ll;

public class LinkedList {
  private Node head;

  public LinkedList() {
    head = null;
  }

  public void add(int value) {
    Node newNode = new Node(value);

    if (head == null) {
      head = newNode;
    } else {
      Node currentNode = head;

      while (currentNode.getNext() != null) {
        currentNode = currentNode.getNext();
      }
      currentNode.setNext(newNode);
    }
  }

  public void addIndex(int idx, int value) {
    if (idx >= 0) {
      Node newNode = new Node(value);

      if (idx == 0) {
        newNode.setNext(head);
        head = newNode;
        return;
      }

      Node currentNode = head;
      Node previousNode = null;
      int count = 0;

      while (currentNode != null && count < idx) {
        previousNode = currentNode;
        currentNode = currentNode.getNext();
        count++;
      }

      if (currentNode == null && count < idx) {
        System.out.println("Index out of bounds");
        return;
      }

      previousNode.setNext(newNode);
      newNode.setNext(currentNode);
    }
  }

  public void remove(int value) {

    if (head == null) {
      System.out.println("List empty");
      return;
    }

    if (head.getValue() == value) {
      head = head.getNext();
      return;
    }

    Node currentNode = head.getNext();
    Node previousNode = head;

    while (currentNode != null && currentNode.getValue() != value) {
      previousNode = currentNode;
      currentNode = currentNode.getNext();
    }

    if (currentNode == null) {
      System.out.println("The value does not exist");
    } else {
      previousNode.setNext(currentNode.getNext());
    }
  }

  public void display() {
    Node currentNode = head;

    while (currentNode != null) {
      System.out.println(currentNode.getValue());
      currentNode = currentNode.getNext();
    }
    System.out.println();
  }
}
