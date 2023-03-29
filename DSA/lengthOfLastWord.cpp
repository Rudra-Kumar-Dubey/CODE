class Solution {
public:
    int lengthOfLastWord(string s) {
       int count = 0,f=0;
       for(int i = s.length()-1; i >= 0; i--){
           if((s[i]>='a' && s[i]<='z') || (s[i]>='A' && s[i]<='Z')){
               f=1;
               count++;
           }else{
               if(f==1){
                   return count;
               }
           }
       }
       return count;
    }
};