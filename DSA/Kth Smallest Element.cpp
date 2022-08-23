#include <bits/stdc++.h>
#include <iostream>
using namespace std;

int main() {
    int arr[6]={4,6,8,2,10,3};
    int k = 4;
    int size = *(&arr + 1) - arr;
    for (int i = 0; i < size - 1; i++){
		for (int j = 0; j < size - i - 1; j++){
			if (arr[j] > arr[j + 1]){
				swap(arr[j], arr[j + 1]);
			}
		}		
    }
    cout<<"Kth Element: "<<arr[k-1]<<endl;
    
    return 0;
}