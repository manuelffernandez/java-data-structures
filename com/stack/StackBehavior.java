package com.stack;

public class StackBehavior {
  public StackBehavior() {

  }

  public void runTest() {
    ArrayStack as = new ArrayStack();

    System.out.println("stack is empty: " + as.isEmpty());
    as.peek();
    as.push(5);
    as.push(4);
    as.push(17);
    as.push(92);
    as.push(8);
    as.push(44);
    as.push(45);
    as.push(46);
    as.list();
    as.pop();
    as.pop();
    as.list();
  }
}
