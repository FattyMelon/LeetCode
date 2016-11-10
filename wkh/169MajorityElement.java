public class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
} //排序取中位数


public class Solution {
    public int majorityElement(int[] nums) {
        int count = 1;
        int majority = nums[0];
        for(int i = 1; i < nums.length;i++){
            if(count == 0){
                 majority = nums[i];
                 count++;
            }
            else if(nums[i] == majority) count++;
            else count--;
        }
        return majority;
    }
}   //Boyer–Moore majority vote algorithm 该元素的出现的次数一定比其他所有元素加起来大，每出现一个不同的元素将该元素count-1，最终count还是会大于0；