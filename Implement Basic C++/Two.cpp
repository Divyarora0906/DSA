#include<iostream>
using namespace std;

int main(){
    int a, b;
    //5 , 10
    cin >> a >> b;
    cout << a << " " << b << endl;
    a = a + b;
    // 15
    b = a - b;
    // 15 - 10 = 5
    a = a - b;
    // 15 - 5 = 10
    cout << a << " " << b;
    return 0;
}
