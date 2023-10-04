package leetcode;

public class MergeSortedArray_88 {
    /**
     * Merges two sorted arrays into the first array.
     * 
     * @param nums1 The first sorted array.
     * @param m     The number of elements in the first array.
     * @param nums2 The second sorted array.
     * @param n     The number of elements in the second array.
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Initialize pointers
        int index1 = m - 1;
        int index2 = n - 1;
        int mergedIndex = m + n - 1;

        // Merge arrays
        while (index2 >= 0) {
            if (index1 >= 0 && nums1[index1] > nums2[index2]) {
                nums1[mergedIndex--] = nums1[index1--];
            } else {
                nums1[mergedIndex--] = nums2[index2--];
            }
        }
    }
}
