#include <iostream>
using namespace std;
bool linear(int arr[], int n, int target) {
    if (n == 0) return false;
    if (arr[n - 1] == target) return true;
    return linear(arr, n - 1, target);}
int main() {
    int n, target;
    cout << "n: ";
    cin >> n;
    int arr[n]; 
    for (int i = 0; i < n; i++) cin >> arr[i];
    cout << "Target: ";
    cin >> target;
    if (linear(arr, n, target))
        cout << "Found";
    else
        cout << "Not found";}
    
//t.c and s.c: O(n)