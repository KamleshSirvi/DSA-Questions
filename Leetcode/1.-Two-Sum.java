// using hashmap 
public int[] twoSum(int[] nums, int target) {
        HashSet<Integer> set = new HashSet<>();
        for(int x : nums){
            set.add(x);
            if(set.contains(target - x)){
                return true;
            }
        }
        return false;
}

// using naive solution
public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        // In case there is no solution, we'll just return null
        return null;
    }
