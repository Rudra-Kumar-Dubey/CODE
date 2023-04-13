class Solution {
public:
    int firstUniqChar(string s) {
        map<char, int> mp;
        for (int i{}; i < s.size(); i++) { mp[s[i]]++;
        } for (int i{}; i < s.size(); i++) {
            if (mp[s[i]] == 1)
                return i;
        } 
        return -1;   }

};
