class Solution {
public:
    int findMaxLength(vector<int>& nums) {
        int c = 0;
        for(int i = 0; i < nums.size() ; i++){
            int z = 0, o = 0;
            for(int j = i ; j < nums.size() ; j++){
                if(nums[j]==0){
                    z++;
                }
                else{
                    o++;
                }
                if(z==o){
                    count = max(count, j - i + 1);
                }
            }
        }
        return count;
    }
};