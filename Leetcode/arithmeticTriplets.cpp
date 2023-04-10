class Solution {
public:
    int arithmeticTriplets(vector<int>& nums, int diff) {
        int count = 0;
        int diffa, diffb;
        if(nums.size()<3){
            return 0;
        }
        for(int i = 0; i < nums.size(); i++){
            for(int j = 1; j < nums.size(); j++){
                for(int k =2; k< nums.size(); k++){
                    if((i<j) && (j<k)){
                        diffa = nums[j] - nums[i];
                        diffb = nums[k] - nums[j];
                        if((diffb == diff) && (diffa == diff)){
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
};
