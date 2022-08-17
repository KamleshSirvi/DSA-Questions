// Efficient Approach using hashMap

public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // create a array for store i and j
        int[] res = new int[2];
        
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target - nums[i])){
                res[0] = map.get(target - nums[i]);
                res[1] = i;
                return res;
            }
            map.put(nums[i], i);
        }
        return null;
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
//          In case there is no solution, we'll just return null
         return null;
    }
