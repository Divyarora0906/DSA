#include<iostream>
using namespace std;

int main(){
    int a;
    bool flag = false;
    cin >> a;
    if (a == 0 || a == 1)
    {
        cout << "Not Prime";
        return 0;
    }

    for (int i = 2; i < a; i++)
    {
        if(a%i==0){
           flag = true;
        }
    }
    flag ? cout << "Not Prime" : cout << "Prime";  
    return 0;
}  