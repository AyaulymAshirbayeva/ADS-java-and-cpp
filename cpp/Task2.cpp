#include <iostream>
using namespace std;
void numbers(int n) {
    if (n == 0) return;
    cout << n << " ";
    numbers(n - 1);}
int main() {
    int n;
    cin >> n;
    numbers(n);}

//t.c and s.c: O(n)