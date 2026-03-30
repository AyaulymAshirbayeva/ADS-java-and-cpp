#include <iostream>
using namespace std;
int counttarget(int arr[], int n, int target) {
    if (n == 0) return 0;
    return (arr[n - 1] == target) + counttarget(arr, n - 1, target);}
int main() {
    int n, target;
    cout<<"n: ";
    cin >> n;
    int arr[n];
    for (int i = 0; i < n; i++) cin >> arr[i];
    cout<<"Target: ";
    cin >> target;
    cout << counttarget(arr, n, target);}

//t.c and s.c: O(n)