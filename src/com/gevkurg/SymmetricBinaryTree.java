package com.gevkurg;

public class SymmetricBinaryTree {
  public int isSymmetric(TreeNode a) {
    if (a == null) {
      return 1;
    }

    return isSymmetric(a.left, a.right);
  }

  private int isSymmetric(TreeNode left, TreeNode right) {
    if (left == null && right == null) {
      return 1;
    }

    if (left == null  && right != null) {
      return 0;
    }

    if (right == null  && left != null) {
      return 0;
    }

    boolean symmetric = left.val == right.val && isSymmetric(left.left, right.right) > 0
        && isSymmetric(left.right, right.left) > 0;

    return symmetric ? 1 : 0;
  }
}
