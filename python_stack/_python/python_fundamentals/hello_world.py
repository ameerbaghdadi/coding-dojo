# 1 Write the code to print a literal string saying "Hello World"
print("Hello World")

# 2a Store your name in a variable, and then use it to print the string “Hello {{your name}}!” using a comma in the print function
name = "ameer"
print("Hello", name+"!")

# 2b Store your name in a variable, and then use it to print the string “Hello {{your name}}!” using a + in the print function
print("Hello "+name+"!")

# 3a Store your favorite number in a variable, and then use it to print the string “Hello {{num}}!” using a comma in the print function
x = 6
print("Hello", str(x)+"!")

# 3b Store your favorite number in a variable, and then use it to print the string “Hello {{num}}!” using a + in the print function
# print("Hello "+x+"!")

# NINJA BONUS: Figure out how to resolve the error from above, without changing the + sign to a comma
print("Hello "+str(x)+"!")

# NINJA BONUS: Figure out how to resolve the error from above, without changing the + sign to a comma

#4a Store 2 of your favorite foods in variables, and then use them to print the string “I love to eat {{food_one}} and {{food_two}}.” with the format method
fave_food1 = "mlo5ia"
fave_food2 = "burger"

print("I love to eat {} and {}".format(fave_food1, fave_food2))

#4b Store 2 of your favorite foods in variables, and then use them to print the string “I love to eat {{food_one}} and {{food_two}}.” with f-strings
print(f"I love to eat {fave_food1} and {fave_food2}")


