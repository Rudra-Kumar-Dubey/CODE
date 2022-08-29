class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        unordered_map<char, int> m;
        int i = 0;
        int j = 0;
        int count = 0;
        int sz = 0;
        while(j<s.length()){
            if(m.find(s[j]) == m.end()){
                m[s[j]]++;
                sz = m.size();
                count = max(sz,count);
                j++;
            }
            else{
                sz= m.size();
                count =max(sz,count);
                while(i<s.size() && m.find(s[j]) != m.end()){
                    m.erase(s[i]);
                    i++;
                }
            }
        }
        return count;
    }
};