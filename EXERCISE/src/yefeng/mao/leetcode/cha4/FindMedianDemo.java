package yefeng.mao.leetcode.cha4;

/**
 * @description: There are two sorted arrays nums1 and nums2 of size m and n respectively.
 * Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
 * You may assume nums1 and nums2 cannot be both empty.
 * <p>
 * Example
 * nums1 = [1, 3]
 * nums2 = [2]
 * The median is 2.0
 * @author: YF.Mao
 * @create: 2019/5/24
 **/
public class FindMedianDemo {
    public static void main(String[] args) {
        int[] nums1 = {};
        int[] nums2 = {1, 2};
        System.out.println(FindMedianDemo.findMedianSortedArrays(nums1, nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int len = len1 + len2;
        int start1 = 0;
        int[] num = new int[len];
        for (int n = 0; n < len; n++) {
            if (start1 < len1) {
                if (n - start1 < len2) {
                    num[n] = (nums1[start1] < nums2[n - start1]) ? nums1[start1++] : nums2[n - start1];
                } else {
                    num[n] = nums1[start1++];
                }
            } else {
                num[n] = nums2[n - start1];
            }
        }

        if (len % 2 == 0) {
            return (num[len / 2 - 1] + num[len / 2]) / 2.0;
        } else {
            return num[(len + 1) / 2 - 1];
        }
    }
}
