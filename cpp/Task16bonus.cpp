#include <iostream>
using namespace std;
int binary(int arr[], int left, int right, int target) {
    if (left > right) return -1;
    int mid = (left + right) / 2;
    if (arr[mid] == target) return mid;
    if (arr[mid] > target)
        return binary(arr, left, mid - 1, target);
    else
        return binary(arr, mid + 1, right, target);}
int main() {
    int n, target;
    cout<<"n: ";
    cin >> n;
    int arr[n];
    for (int i = 0; i < n; i++) cin >> arr[i];
    cout<< "Target: ";
    cin >> target;
    int result = binary(arr, 0, n - 1, target);
    if (result != -1)
        cout << "Element found at index " << result;
    else
        cout << "Not found";}