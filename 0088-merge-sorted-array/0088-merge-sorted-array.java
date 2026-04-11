public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Pointer for the last element in nums1 (actual elements)
        int i = m - 1;
        // Pointer for the last element in nums2
        int j = n - 1;
        // Pointer for the last position in nums1
        int k = m + n - 1;

        // Merge in reverse order
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i]; // Place the larger element at the end
                i--;
            } else {
                nums1[k] = nums2[j]; // Place the larger element at the end
                j--;
            }
            k--;
        }

        // If there are remaining elements in nums2, add them
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }

        // No need to copy the remaining elements of nums1, they are already in place
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test case 1
        int[] nums1_1 = {1, 2, 3, 0, 0, 0};
        int m1 = 3;
        int[] nums2_1 = {2, 5, 6};
        int n1 = 3;
        solution.merge(nums1_1, m1, nums2_1, n1);
        System.out.println(java.util.Arrays.toString(nums1_1)); // Output: [1, 2, 2, 3, 5, 6]

        // Test case 2
        int[] nums1_2 = {1};
        int m2 = 1;
        int[] nums2_2 = {};
        int n2 = 0;
        solution.merge(nums1_2, m2, nums2_2, n2);
        System.out.println(java.util.Arrays.toString(nums1_2)); // Output: [1]

        // Test case 3
        int[] nums1_3 = {0};
        int m3 = 0;
        int[] nums2_3 = {1};
        int n3 = 1;
        solution.merge(nums1_3, m3, nums2_3, n3);
        System.out.println(java.util.Arrays.toString(nums1_3)); // Output: [1]
    }
}
