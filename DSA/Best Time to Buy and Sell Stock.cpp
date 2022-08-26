class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int maxProfit = 0;
        int MIN = INT_MAX;
        for(int i = 0 ; i<prices.size(); i++){
            MIN = min(MIN, prices[i]);
            maxProfit = max(maxProfit,prices[i]-MIN);
        }
        return maxProfit;
    }
};