// using sorting 
public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        for(int i = nums.length-2; i >= 0; i--){
            if(nums[i + 1] == nums[i]){
                continue;
            }else{
                count++;
                if(count == 2){
                    return nums[i];
                }
            }
        }
        return nums[nums.length-1];
    }
