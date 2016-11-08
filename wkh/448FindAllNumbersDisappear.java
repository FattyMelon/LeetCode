public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<Integer>();
        int len = nums.length;
        for(int i = 0; i<len; i++){
            int val = Math.abs(nums[i])-1;
            if(nums[val]>0) nums[val] = -nums[val];
        }
        for(int k = 0; k<len; k++){
            if(nums[k] > 0) res.add(k+1); 
        }
        return res;
    }
}
//挺有意思的解法. 每个数组内的元素等于几就把第几个元素变成负的，最后假设第三个元素还是正的就表示没有3出现