public int[] sortedSquares(int[] nums) {
        // other method two pointer approach : time complexity = n
        int n = nums.length;
        int[] res = new int[n];
        int i = 0;
        int j = n - 1;
        for(int k = n - 1; k >= 0; k--){
            if(Math.abs(nums[i]) > Math.abs(nums[j])){
                res[k] = nums[i] * nums[i];
                i++;
            }else{
                res[k] = nums[j] * nums[j];
                j--;
            }
        }
        return res;
    }

public int[] sortedSquares(int[] nums) {
//         time complexity = nlogn
        for(int i = 0; i < nums.length; i++){
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
