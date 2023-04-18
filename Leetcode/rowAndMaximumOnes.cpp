class Solution {
public:
    vector<int> rowAndMaximumOnes(vector<vector<int>>& mat) {
        vector<int> res(2);
        int count = 0;
        for(int i = 0; i < mat.size(); i++){
            for(int j = 0; j < mat[0].size(); j++){
                if(mat[i][j] == 1){
                    count++;
                }
            }
            if(count>res[1]){
                res = {i, count};
            }
            count = 0;
        }
        return res;
    }
};
