package com.java.board.core.leetCode;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Code0001TwoSum {

  public static void main(String[] args) {

    int[] numbs = {2,7,11,15};
    int target = 9;
    log.info("Indices of the two numbers : {}", twoSum(numbs, target));
  }

  public static int[] twoSum(int[] numbs, int target) {
    int[] result = new int[2];

    for (int i = 0; i < numbs.length; i++) {
      int temp = target - numbs[i];
      for (int j = i + 1; j < numbs.length; j++) {
        if (numbs[j] == temp) {
          result[0] = i;
          result[1] = j;
          return result;
        }
      }
    }

    return result;
  }
}
