class Solution {
public:
    int climbStairs(int n) {
        // using dp
        if(n <= 2){
            return n;
        }

        vector<int> dp(n+1, -1);

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        for(int i = 3; i <= n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];

    }
};



// gfg solution 
//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends
class Solution
{
    public:
    //Function to count number of ways to reach the nth stair.
    int countWays(int n)
    {
        // your code here
        // using Dynamic programming 
        
        int m = pow(10, 9) + 7;
        if(n <= 2){
            return n;
        }
        
        int prev2 = 2;
        int prev = 3;
        
        for(int i = 4; i <= n; i++){
            int curri = (prev + prev2) % m;
            prev2 = prev;
            prev = curri;
        }
        
        return prev % m;
    }
};



//{ Driver Code Starts.
int main()
{
    //taking total testcases
    int t;
    cin >> t;
    while(t--)
    {
        //taking stair count
        int m;
        cin>>m;
        Solution ob;
        cout<<ob.countWays(m)<<endl; // Print the output from our pre computed array
    }
    return 0;
}

// } Driver Code Ends
