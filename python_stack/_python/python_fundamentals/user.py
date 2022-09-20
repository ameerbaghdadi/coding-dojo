class User:
    def __init__(self, name, email):
        self.name = name
        self.email = email
        self.account_balance = 0

    def make_deposit(self, amount):
        self.account_balance += amount

    def make_withdrawal(self, amount):
        self.account_balance -= amount

    def display_user_balance(self):
        print("User", self.name, "Account", self.account_balance)

    def transfer_money(self, other_user, amount):
        self.account_balance = amount
        other_user.account_balance = other_user.account_balance - amount


ali = User("Ali", "ali@ali.com")
omar = User("omar", "omar@omar.com")
sara = User("sara", "sara@sara.com")

ali.make_deposit(100)
ali.make_deposit(200)
ali.make_deposit(300)
ali.make_withdrawal(50)
ali.display_user_balance()

omar.make_deposit(100)
omar.make_deposit(200)
omar.make_withdrawal(30)
omar.make_withdrawal(50)
omar.display_user_balance()

sara.make_deposit(100)
sara.make_withdrawal(10)
sara.make_withdrawal(20)
sara.make_withdrawal(40)
sara.display_user_balance()

print("--------Bouns--------")
omar.transfer_money(ali, 20)
omar.display_user_balance()
ali.display_user_balance()
