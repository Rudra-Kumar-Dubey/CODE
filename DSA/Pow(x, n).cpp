class Solution {
public:
double myPow(double x, int n) {

    if(n==0) return 1;
    else if(n<0) {
        double k =double(n);
        return 1/(x * myPow(x,-k-1));
    }
    else{
        if(n%2==0)
            return myPow(x*x,n/2);
        else
            return (x*myPow(x,n-1));
    }
}
};