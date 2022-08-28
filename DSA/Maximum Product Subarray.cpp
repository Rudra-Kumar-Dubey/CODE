class Solution {
public:
    int maxProduct(vector<int>& nums) {
        int res = nums[0], minn = nums[0], maxx = nums[0];
        for(int i = 1; i < nums.size(); i++)
        {
            int temp = maxx;
            maxx = max({maxx * nums[i], minn * nums[i], nums[i]});
            cout<<maxx<<endl;
            minn = min({temp * nums[i], minn * nums[i], nums[i]});            
            res  = max(res, maxx);
        }
        return res;
    }
};