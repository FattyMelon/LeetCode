


int* twoSum(int* nums, int numsSize, int target) {
    int *index= malloc(2);
    for(int i=0;i<numsSize;i++){
        for(int j=i+1;j<numsSize;j++){
            if(nums[i]+nums[j]==target){
                index[0] = i;
                index[1] = j;
                break;
            }
        }
    }
    return index;
}
