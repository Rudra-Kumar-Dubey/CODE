class Solution {
public:
    int minimumRecolors(string blocks, int k) {
        int res=0,count=0;
        for(int i=0;i<k;i++)
        {
            if(blocks[i]=='B')
            count++;
        }
        res = max(res,count);
        for(int i=k;i<blocks.length();i++)
        {
            if(blocks[i]=='B'&&blocks[i-k]=='W')
            count++;
            if(blocks[i]=='W'&&blocks[i-k]=='B')
            count--;
            res = max(res,count);
        }
        return k-res;
    }
};
