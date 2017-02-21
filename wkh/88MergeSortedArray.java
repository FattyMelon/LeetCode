public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int cur1 = m-1, cur2 = n-1, start = m+n-1;
        while(cur1>=0 && cur2>=0){
            if(nums1[cur1]<nums2[cur2]){
                nums1[start--] = nums2[cur2--];
            }
            else{
                nums1[start--] = nums1[cur1--];
            }
        }
        if(cur1<=0){
            while(cur2>=0){
                nums1[start--] = nums2[cur2--];
            }
        }
}
}