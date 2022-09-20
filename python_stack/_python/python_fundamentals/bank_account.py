class BankAccount:
    
    def __init__(self, int_rate, balance = 0):
        self.interest_rate = int_rate
        self.account_balance = balance
        
    def deposit(self, amount):
        self.account_balance += amount
        return self

    def withdraw(self, amount):
        if self.account_balance < amount:
            print("Insufficient funds: Charging a $5 fee")
            self.account_balance -= 5
        else:
            self.account_balance -= amount
        return self

    def display_account_info(self):
        print("Balance:", self.account_balance)
        return self

    def yield_interest(self):
        self.account_balance += self.account_balance * self.interest_rate
        return self

ali = BankAccount(0.06, 700)
omar = BankAccount(0.08, 0)

ali.deposit(100).deposit(200).deposit(300).withdraw(70).display_account_info().yield_interest()
omar.deposit(100).deposit(200).withdraw(200).withdraw(100).withdraw(100).display_account_info().yield_interest()