#include<iostream>
using namespace std;

int main(){
    cout << "Enter the value of N: ";
    int n;
    int sum = 0;
    cin >> n;
    for (int i = 1; i <= n; i++)
    {
        int a;
        cin >> a;
        sum += a;
    }
    cout << "Average is " << sum/n;
    return 0;
}