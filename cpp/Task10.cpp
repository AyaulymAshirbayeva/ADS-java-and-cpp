#include <iostream>
using namespace std;
bool palindrome(string s, int l, int r) {
    if (l >= r) return true;
    if (s[l] != s[r]) return false;
    return palindrome(s, l + 1, r - 1);}
int main() {
    string s;
    cin >> s;
    if (palindrome(s, 0, s.size() - 1))
        cout << "Palindrome";
    else
        cout << "Not palindrome";}

//t.c and s.c: O(n), n length of string