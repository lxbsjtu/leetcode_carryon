package Banker;

/**
 * Created by lxb on 16/1/23.
 */
public class ReverseInt {
    public static int reverse(int x) {
        int x1 = (x < 0) ? -x : x;
        int mod;
        int[] res = new int[20];
        int index = 0;
        while(x1 > 0){
            mod = x1 % 10;
            res[index++] = mod;
            x1 /= 10;
        }
        res[index] = -1;
        Long res1 = 0l;
        for(int i = 0; i < res.length && res[i] >= 0; ++i){
            res1 *= 10;
            res1 += res[i];
            if(res1 > 2147483647) {    // if res1 is bigger than the maximum value of an int;
                res1 = 0l;
                break;
            }
        }
        int res2 = res1.intValue();
        return (x < 0) ? -res2: res2;
    }
}
