package com.gevkurg;

public class SumRootToLeafNumbers {
  public int sumNumbers(TreeNode a) {
    if (a == null) {
      return 0;
    }

    return sumNumbers(a, 0) % 1003;
  }

  private int sumNumbers(TreeNode node, int currentNumber) {
    if (node == null) {
      return 0;
    }

    currentNumber = currentNumber * 10 + node.val;
    if (node.left == null && node.right == null) {
      return currentNumber;
    }

    return sumNumbers(node.left, currentNumber) + sumNumbers(node.right, currentNumber);
  }
}
