package LeetCode;
import java.io.*;
import java.util.*;

public class tUf {
  public static int solve(int n, int key, int[] v) {
    int res = -1;
    for (int i = 0; i < n; i++) {
      if (v[i] == key) {
        res = i;
        break;
      }
    }
    return res;
  }
  public static void main(String args[]) {
    int n = 7;
    int key = 4;
    int[] v = {3,4,4,13,32,50,70};

    // returning the first occurrence index if the element is present otherwise -1
    System.out.println(solve(n, key, v));
  }
}