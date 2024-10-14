package DSA.LeetCodeStudyPlan;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DifferenceInTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,};
        int[] nums2 = {1,1,2,2, 4, 5};
        List<List<Integer>> res  = findDifference(nums1, nums2);
        System.out.println(res);
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> in1 = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        Set <Integer> n2 = new HashSet<>();
        Set <Integer> n1 = new HashSet<>();
        for (int num : nums2) {
            n2.add(num);
        }
        for (int num : nums1) {
            n1.add(num);
        }
        System.out.println("printing Set n2: "+n2);
        System.out.println("printing Set n1: "+n1);
        for (Integer num : n1) {
            if (n2.contains(num)) {
                n2.remove(num);
            } else {
                in1.add(num);
            }
        }
        List<Integer> in2 = new ArrayList<>(n2);
        result.add(in1);
        result.add(in2);
        return result;
    }
}
