class Solution {
public:
    bool isPowerOfTwo(int n) {
        long x = 1;
        long res = 0;
        
        while(x <= n){
            res = x ^ n;
            x = x << 1;
            if(res == 0){
                return true;
            }
        }
        return false;
    }
};
