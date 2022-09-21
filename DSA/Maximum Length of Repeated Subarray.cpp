class Solution {
public:
    int findLength(vector<int>& n1, vector<int>& n2) {
        
        if (n1.size() < n2.size()) swap(n1, n2);
        int M = n1.size(), N = n2.size();
        vector<int> dp(N + 1, 0);
        int maxx = 0;
        
        for(int i = 0; i < M; i++) {
            for(int j = N - 1; j >= 0; j--) {
                
                if (n1[i] == n2[j]) {
                    dp[j + 1] = 1 + dp[j];
                } else {
                    dp[j + 1] = 0;
                }
                              
                maxx = max(maxx, dp[j + 1]);
            }
            
        }
        
        return maxx;
    }
};