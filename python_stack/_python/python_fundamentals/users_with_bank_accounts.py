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

class User:
    def __init__(self, name, email):
        self.name = name
        self.email = email
        self.account = BankAccount(int_rate = 0.02, balance = 0) 

ali= User("Ali", "ali@ali.com")

ali.account.deposit(400).withdraw(50).display_account_info()

#     def make_deposit(self, amount):
#         self.account.deposit(amount)
#         return self

#     def make_withdrawal(self, amount):
#         self.account.withdraw(amount)
#         return self

#     def display_user_balance(self):
#         print("User", self.name)
#         self.account.display_account_info()
#         return self

# ali= User("Ali", "ali@ali.com")

# ali.make_deposit(405).make_withdrawal(50).display_user_balance()

