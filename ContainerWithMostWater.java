package Banker;

/**
 * Created by lxb on 16/1/23.
 */
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int right = height.length - 1;
        int left = 0;
        int r = right;
        int l = 0;
        int maxArea = 0;
        while (r != l) {
            int areaTmp;
            if (height[r] >= height[l]) {
                areaTmp = height[l] * (r - l);
                if (areaTmp > maxArea) {
                    maxArea = areaTmp;
                    right = r;
                    left = l;
                } else l++;
            } else {
                areaTmp = height[r] * (r - l);
                if (areaTmp > maxArea) {
                    maxArea = areaTmp;
                    right = r;
                    left = l;
                } else r--;

            }
        }
        return maxArea;
    }
}