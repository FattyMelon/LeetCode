public class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int id = 1;
        if(n<2) return n;
        for(int i =1; i<n;i++){
            if(nums[i]!=nums[i-1]){
                nums[id] = nums[i];
                id++;
            }
        }
        return id;
}}
