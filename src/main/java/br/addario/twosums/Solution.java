package br.addario.twosums;

import java.util.Set;
import java.util.TreeSet;

public class Solution {
    public int[] twoSum(int[] nums, int target) {

        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] + nums[j] == target) {
                    set.add(i);
                }
            }
        }

        int index = 0;
        int[] result = new int[set.size()];
        for (Integer integer : set) {
            result[index] = integer;
            index++;
        }

        return result;
    }
}
