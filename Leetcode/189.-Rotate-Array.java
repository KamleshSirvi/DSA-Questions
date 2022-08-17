// using reverse nethod
public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int n = nums.length - 1;
        reverse(nums, 0, n);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n);
}
    void reverse(int[] nums, int low, int high){
        while(low < high){
            int temp = nums[low];
            nums[low] = nums[high];
            nums[high] = temp;
            low++;
            high--;
        }
    }

// naive solution: Time complexity = n^2
public void rotate(int[] nums, int k) {
        int n = nums.length - 1;
        for(int i = 0; i < k; i++){
            int temp = nums[n];
            for(int j = n; j > 0; j--){
                nums[j] = nums[j-1];
            }
            nums[0] = temp;
        }
    }
}
