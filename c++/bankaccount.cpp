#include <iostream>
#include <string>
using namespace std;

class Loan; 

class BankAccount {
private:
    string name;
    double balance;

public:
    BankAccount(string accName, double accBalance) {
        name = accName;
        balance = accBalance;
    }


    friend void checkEligibility(const BankAccount &account, const Loan &loan);
};

class Loan {
private:
    double loanAmount;

public:
    Loan(double amount) {
        loanAmount = amount;
    }


    friend void checkEligibility(const BankAccount &account, const Loan &loan);
};


void checkEligibility(const BankAccount &account, const Loan &loan) {
    cout << "\n--- Loan Eligibility Check ---\n";
    cout << "Account Holder: " << account.name << endl;
    cout << "Account Balance: " << account.balance << endl;
    cout << "Requested Loan Amount: " << loan.loanAmount << endl;

    if (loan.loanAmount <= 2 * account.balance) {
        cout << "✅ Loan Approved: Eligible!" << endl;
    } else {
        cout << "❌ Loan Rejected: Not Eligible!" << endl;
    }
}

int main() {
    string name;
    double balance, loanAmount;

    cout << "Enter Account Holder Name: ";
    getline(cin, name);
    cout << "Enter Account Balance: ";
    cin >> balance;
    cout << "Enter Loan Amount: ";
    cin >> loanAmount;

    BankAccount account(name, balance);
    Loan loan(loanAmount);

    checkEligibility(account, loan);

    return 0;
}
