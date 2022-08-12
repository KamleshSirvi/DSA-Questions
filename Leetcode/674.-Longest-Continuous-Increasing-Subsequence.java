public int findLengthOfLCIS(int[] nums) {
        int res = 0;
        int count = 0;
        for(int i = 0; i < nums.length; i++){
                if(i == 0 || nums[i - 1] < nums[i]){
                    count++;
                    res = Math.max(res, count);
                }else{
                    // update the count variable
                    count = 1;
                }
        }
        return res;
    }
