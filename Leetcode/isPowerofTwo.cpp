class Solution {
public:
    bool isPowerOfTwo(int n) {
        long var = 1;
        while(var<=n){
            if(var == n){
                return true;
            }else{
                var *= 2;
            }
        }
        return false;
    }
};
