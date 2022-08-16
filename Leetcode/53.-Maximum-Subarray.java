public int maxSubArray(int[] nums) {
        // efficient approach
        int ans = nums[0];
        int curr = nums[0];
        
        for(int i = 1; i < nums.length; i++){
            curr = Math.max(curr + nums[i] , nums[i]);
            ans = Math.max(ans, curr);
        }
        return ans;
        
        // naive solution
        int res = 0;
        for(int i = 0; i < nums.length; i++){
            int sum = 0;
            for(int j = i; j < nums.length; j++){
                sum = sum + nums[j];
                res = Math.max(res, sum);
            }
        }
        return res;
    }
