class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        int MAX = 0;
        int count = 0;
        sort(nums.begin(),nums.end());
 
        for(int i = 1 ; i < nums.size() ; i++){
            if(nums[i] == nums[i-1]+1){
                count++;
                MAX =  max(MAX,count);
            }
            else if(nums[i-1] == nums[i]){
                continue;
            }
            
            else{
                count = 0;
            }
            
        }
        if(nums.size() == 0){
            return 0;
        }
        else if(nums.size() == 1){
            return 1;
        }
        else{
            return MAX+1;
        }
    }
};