package com.gevkurg;

public class Sqrt {

  public static int sqrt(int a) {
    if (a == 0 || a == 1) {
      return a;
    }

    int l = 1;
    int r = a;

    while (l <= r) {
      int m = l + (r - l) / 2;
      if (m > a / m) {
        r = m - 1;
      } else if (m + 1 > a / (m + 1)) {
        return m;
      } else {
        l = m + 1;
      }
    }

    return -1;
  }
}
