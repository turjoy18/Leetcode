class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int[] nums = new int[nums1.length + nums2.length];
        int i = 0;
        int j = 0;
        int index = 0;
        
        for (; i < nums1.length && j < nums2.length;) {
            if (nums1[i] < nums2[j]) {
                nums[index++] = nums1[i++];
            } else if (nums2[j] < nums1[i]) {
                nums[index++] = nums2[j++];
            } else {
                nums[index++] = nums1[i++];
                nums[index++] = nums2[j++];
            }
        }
        
        while (i < nums1.length) {
            nums[index++] = nums1[i++];
        }
        
        while (j < nums2.length) {
            nums[index++] = nums2[j++];
        }
        
        double median = 0;
        int mid = nums.length / 2;
        
        if (nums.length % 2 == 0) {
            median = (nums[mid - 1] + nums[mid]) / 2.0; 
        } else {
            median = nums[(mid)];
        }
        
        return median;
        
    }
}