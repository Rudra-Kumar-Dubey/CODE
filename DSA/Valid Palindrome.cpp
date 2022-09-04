class Solution {
public:
    bool isPalindrome(string s) {
        string k = "";
        for(int i = 0 ; i < s.size()  ; i++){
            if(s[i]>= 'A' && s[i] <= 'Z'){
                k += tolower(s[i]) ;
            }
            if(s[i] >= 'a' && s[i] <= 'z'){
                k += s[i];
            }
            if(s[i] >= '0' && s[i] <= '9'){
                k += s[i];
            }
        }
        s = k;
        k = "";
        for(int i = s.size()-1 ; i >= 0 ; i--){
            k += s[i];
        }
     return s==k; 
    }
};