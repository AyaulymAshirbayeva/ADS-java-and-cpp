#include <iostream>
using namespace std;
bool sorted(int arr[], int n) {
    if (n <= 1) return true;
    if (arr[n - 1] < arr[n - 2]) return false;
    return sorted(arr, n - 1);}
int main() {
    int n;
    cin >> n;
    int arr[n];
    for (int i = 0; i < n; i++) cin >> arr[i];
    if (sorted(arr, n))
        cout << "Sorted";
    else
        cout << "Not sorted";}

//t.c and s.c: O(n)