package com.gevkurg;

import java.util.ArrayList;
import java.util.List;


public class SearchForaRange {
  public ArrayList<Integer> searchRange(final List<Integer> a, int b) {
    ArrayList<Integer> result = new ArrayList<>();
    result.add(-1);
    result.add(-1);

    int first = findFirst(a, b);

    if (first == -1) {
      return result;
    }

    result.set(0, first);

    int last = findLast(a, b);
    result.set(1, last);

    return result;
  }

  private int findFirst(List<Integer> a, int b) {
    if (a == null) {
      return -1;
    }

    int l = 0;
    int r = a.size() - 1;

    while (l <= r) {
      int m = l + (r - l) / 2;
      if ((m == 0 || a.get(m - 1) != b) && a.get(m) == b) {
        return m;
      } else if (b > a.get(m)) {
        l = m + 1;
      } else {
        r = m - 1;
      }
    }

    return -1;
  }

  private int findLast(List<Integer> a, int b) {
    if (a == null) {
      return -1;
    }

    int l = 0;
    int r = a.size() - 1;

    while (l <= r) {
      int m = l + (r - l) / 2;
      if ((m == r || a.get(m + 1) != b) && a.get(m) == b) {
        return m;
      } else if (b < a.get(m)) {
        r = m - 1;
      } else {
        l = m + 1;
      }
    }

    return -1;
  }
}
