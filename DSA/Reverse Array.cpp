#include <iostream>
using namespace std;

int main() {
    int l[3] = {1,2,3};
    int s = *(&l + 1) - l;
    int o[s] ={};
    for(int j=0;j<s;j++){
        o[s-j-1] = l[j];
    }
    for(int i=0; i<s;i++){
        cout<<o[i];
    }
    return 0;
}