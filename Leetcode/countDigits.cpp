class Solution {
public:
    int countDigits(int num) {
        int divs = 0;
        int x = num;
        int rem = 0;
        while(x>0){
            rem = x%10;
            if(num%rem == 0){
                divs++;
            }
            x = x/10;
        }
        return divs;
    }
};
