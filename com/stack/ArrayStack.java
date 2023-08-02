package com.stack;

public class ArrayStack implements Stack {
  static final int MAX = 7;
  public int top;
  int[] a = new int[MAX];

  public ArrayStack() {
    this.top = -1;
  }

  @Override
  public boolean isEmpty() {
    return (top < 0);
  }

  @Override
  public boolean push(int x) {
    if (top >= (MAX - 1)) {
      System.out.println("Stack overflow");
      return false;
    } else {
      a[++top] = x;
      System.out.println(x + " pushed into stack");
      return true;
    }
  }

  @Override
  public int pop() {
    if (this.isEmpty()) {
      System.out.println("Stack underflow");
      return 0;
    } else {
      int tmp = a[top--];
      return tmp;
    }
  }

  @Override
  public int peek() {
    if (this.isEmpty()) {
      System.out.println("Stack underflow");
      return 0;
    } else {
      return a[top];
    }
  }

  @Override
  public void list() {
    System.out.println("");
    for (int i = this.top; i > -1; i--) {
      System.out.print(a[i] + " ");
    }
  }
}
