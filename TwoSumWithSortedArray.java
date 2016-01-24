package Banker;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lxb on 15/11/2.
 */

public class TwoSumWithSortedArray {
    public static void main(String[] args){
        TwoSum t = new TwoSum();
        // int[] numbers = {2, 7, 11, 15};
        // int target = 9;
        int[] numbers = {1,2, 4, 7, 8, 10, 20, 30}; // 6 = 3 + 3
        int target = 15;

        int[] res = t.twoSum(numbers, target);
        for (int i = 0; i < res.length; i++) {
            System.out.print(i == res.length - 1 ? res[i] : res[i] + ", ");
        }
    }
    public int[] twoSum(int[] numbers, int target) {
        int segregate = target / 2;
        int[] segregateIndex = search(numbers, segregate, 0, numbers.length - 1);
        int[] res;
        for(int i = 0; i <= segregateIndex[1]; ++i){
            res = search(numbers, target - numbers[0], segregateIndex[1] + 1, numbers.length - 1);
            if(res[0] == 0) return new int[] {i + 1, res[1] + 1};
        }
        return null;
    }
    public int[] search(int[] numbers, int target, int left, int right) {
        int mid = (left + right) / 2;
        if(mid == left) return new int[] {-1, mid};
        if(numbers[mid] > target) search(numbers, target, left, mid);
        if(numbers[mid] < target) search(numbers, target, mid + 1, right);
        return new int[] {0, mid};
    }


}
