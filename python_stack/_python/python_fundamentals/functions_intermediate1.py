# should print a random integer between 0 to 100
import random
def randInt():
    num = random.random()
    return num
print(randInt())

# should print a random integer between 0 to 50
import random
def randInt(max):
    num = random.random()
    return num
print(randInt(max=50))

# should print a random integer between 50 to 100
import random
def randInt(min):
    num = random.random()
    return num
print(randInt(min=50))

# should print a random integer between 50 and 500
import random
def randInt(min, max):
    num = random.random()
    return num
print(randInt(min=50, max=500))

#BONUS: account for any edge cases (eg. min > max, max < 0)
print("-----BONUS------")