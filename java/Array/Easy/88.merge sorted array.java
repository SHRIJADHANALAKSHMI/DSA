class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while(i >= 0 && j >= 0){

            if(nums1[i] > nums2[j]){
                nums1[k] = nums1[i];
                i--;
            }
            else{
                nums1[k] = nums2[j];
                j--;
            }

            k--;
        }

        while(j >= 0){
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}
/*
1. Use 3 pointers: i, j, k
2. Start from the end
3. Compare nums1[i] and nums2[j]
4. Put bigger number at nums1[k]
5. Move pointers
6. Copy remaining nums2 elements */
