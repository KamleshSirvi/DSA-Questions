public int findNumbers(int[] nums) {
        int num = 0;
        for(int i = 0; i < nums.length; i++){
            int digit = findDigit(nums[i]);
            if(digit % 2 == 0){
                num++;
            }
        }
        return num;
    }
    // this function is created by me
    public int findDigit(int n){
        int count = 0;
        while(n > 0){
            n = n / 10;
            count++;
        }
        return count;
    }
