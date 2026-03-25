#include <iostream>
using namespace std;
int power(int a, int b) {
    if (b == 0) return 1;
    return a * power(a, b - 1);}
int main() {
    int a, b;
    cin >> a >> b;
    if (b < 0) {
        cout << "b cannot be negative";
    } else {
        cout << power(a, b);
    }}
  