class Solution {
public:
    bool isAnagram(string s, string t) {
        map<char,int> mp;
        map<char,int> up;
        if(s.length() == t.length()){
            for(int i = 0; i < s.length(); i++){
                mp[s[i]]++;
                up[t[i]]++;
            }
            for(int i = 0; i < t.length(); i++){
                if(up[t[i]] != mp[t[i]]){
                    return false;
                }
            }
        }
        else{
            return false;
        }
        return true;
    }
};
