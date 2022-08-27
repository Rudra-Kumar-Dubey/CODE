class Solution {
public:
    bool isPalindrome(int x) {
    int rev = x;
    long sum = 0;
    while(rev>0){
        sum = sum*10 + rev%10;
        rev /= 10;
    }
    return x == sum;
    }
};