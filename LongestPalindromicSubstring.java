package Banker;
import java.util.Arrays;
import java.lang.Math.*;
/**
 * Created by lxb on 16/1/8.
 */
public class LongestPalindromicSubstring {
    public String longestPalindrome(String S){
        if(S.length() == 1) return S;
     char[] S2 = addBoundaries(S.toCharArray());
        int[] p = new int[S2.length];
        int mx = 0, id = 0, n = 0, m = 0;
        p[0] = 1;
        for(int i = 1; i < S2.length; ++i) {
           if(i >= mx){
               p[i] = 0;
               m = i - 1;
               n = i + 1;
           } else{
               int j = 2 * id - i;
               if(mx - i > p[j]) {
                   p[i] = p[j];
                   m = -1;// This signals bypassing the while loop below.
               } else{
                   p[i] = mx - i;
                   n = mx + 1;
                   m = 2 * i - n;

               }
           }

            while(m >= 0 && n < S2.length && S2[m] == S2[n]){
                p[i]++;
                m--;
                n++;
            }
            if((i + p[i]) > mx){
                mx = i + p[i];
                id = i;
            }
        }
        int len = 0;
        id = 0;
        for(int i = 0; i < S2.length; ++i){
            if(p[i] > len){
                len = p[i];
                id = i;
            }
        }
        char[] res = Arrays.copyOfRange(S2, id - p[id], id + p[id]);
        return String.valueOf(removeBoundaries(res));

    }
    private static char[] addBoundaries(char[] cs){

        char[] cs2 = new char[cs.length * 2 + 1];
        for(int i = 0; i < (cs2.length - 1); i = i + 2) {
            cs2[i] = '#';
            cs2[i + 1] = cs[i / 2];
        }
        cs2[cs2.length - 1] = '#';
        return cs2;
    }
    private static char[] removeBoundaries(char[] cs) {

        char[] cs2 = new char[cs.length / 2];
        for(int i = 1; i <= (cs.length - 1); i = i + 2) {
            cs2[i / 2] = cs[i];
        }
        return cs2;
    }
}
