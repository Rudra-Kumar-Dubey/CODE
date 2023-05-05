class Solution {
public:
    int isWinner(vector<int>& player1, vector<int>& player2) {
        int c1=0,c2=0;
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0; i < player1.size(); i++){
            if(c1>0){
                sum1 += player1[i];
                c1--;
            }
            if(c2>0){
                sum2 += player2[i];
                c2--;
            }
            if(player1[i] == 10){
                c1 = 2;
            }
            if(player2[i] == 10){
                c2 = 2;
            }
            sum1 += player1[i];
            sum2 += player2[i];
        }
        if(sum1>sum2){
            return 1;
        }else if(sum2>sum1){
            return 2;
        }else{
            return 0;
        }
    }
};
