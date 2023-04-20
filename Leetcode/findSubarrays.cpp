class Solution {
public:
    bool findSubarrays(vector<int>& nums) {
        map<int, int> mp;
        int sum = 0;
        for(int i = 1; i < nums.size();i++){
            sum = nums[i-1]+nums[i];
            if(mp[sum]){
                return true;
            }
            else{
                mp[sum]++;
            }
        }
        return false;
    }
};
