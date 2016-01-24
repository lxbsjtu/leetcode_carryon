package Banker;
import java.lang.reflect.Array;
import java.util.*;
import java.util.HashMap;
/**
 * Created by lxb on 15/11/6.
 */
public class LongestSubstring {
    public static void main(String[] args){
        String a = "twmopmabctb";
            System.out.println(lengthOfLongestSubstring(a));
    }
    public static int lengthOfLongestSubstring(String s) {
        boolean[] exist = new boolean[256];
        int i = 0, maxLen = 0;
        for (int j = 0; j < s.length(); j++) {
            while (exist[s.charAt(j)]) {
                exist[s.charAt(i)] = false;
                i++;
                System.out.println(i);
            }
            exist[s.charAt(j)] = true;
            maxLen = Math.max(j - i + 1, maxLen);
            if(maxLen == 7) System.out.println(i);
        }
        return maxLen;

    }
}
