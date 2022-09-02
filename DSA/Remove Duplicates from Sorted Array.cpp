class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        unordered_map<int , int> m;
        int j = 0;
        for(int i = 0 ; i < nums.size() ; i++){
            if(m.find(nums[i]) == m.end()){
                m[nums[i]]++;
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
};