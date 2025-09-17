#include<iostream>
using namespace std;

int main(){
    int a, b;
    cin >> a >> b;
    cout << "Enter 1 for Addition, 2 for Subtraction, 3 for Multiplication, 4 for Division: ";
    int choice;
    cin >> choice;
    switch (choice)
    {
    case 1:
        cout << a + b;
        break;
    case 2:
        cout << a - b;
        break;
    case 3:
        cout << a * b;
        break;
    case 4:
        cout << a / b;
        break;
    default:
        cout << "Invalid Input";
        break;
    }
    return 0;
}