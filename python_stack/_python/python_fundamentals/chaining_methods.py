class User:
    def __init__(self, name, email):
        self.name = name
        self.email = email
        self.account_balance = 0
    
    def make_deposit(self, amount):
        self.account_balance += amount
        return self

    def make_withdrawal(self, amount):
        self.account_balance -= amount
        return self

    def display_user_balance(self):
        print("User", self.name, "Account", self.account_balance)
        return self

    def transfer_money(self, other_user, amount):
        self.account_balance=amount
        other_user.account_balance = other_user.account_balance- amount
        return self


ali= User("Ali", "ali@ali.com")
omar= User("omar", "omar@omar.com")
sara= User("sara", "sara@sara.com")

ali.make_deposit(100).make_deposit(200).make_deposit(300).make_withdrawal(50).display_user_balance()

omar.make_deposit(100).make_deposit(200).make_withdrawal(30).make_withdrawal(50).display_user_balance()

sara.make_deposit(100).make_withdrawal(10).make_withdrawal(20).make_withdrawal(40).display_user_balance()

print("--------Bouns--------")
omar.transfer_money(ali,20).display_user_balance()
ali.display_user_balance()