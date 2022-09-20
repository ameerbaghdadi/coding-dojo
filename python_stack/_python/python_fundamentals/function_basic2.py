#1 countdown
empty_list = []
def countdown(x):
    for x in range(x, -1, -1):
        empty_list.append(x)
    return empty_list
print(countdown(10))

#2 Print and Return
def print_and_return(list):
    print(list[0])
    return list[1]
y = print_and_return([1,2])
print(y)

#3 First Plus Length
def first_plus_length(my_list):
    return my_list[0] + len(my_list)
s = first_plus_length([6,4,5,2])
print(s)

#4 Values Greater than Second
from operator import le


def values_greater_than_second(my_list):
    new_list = []
    for x in range(0, len(my_list), 1):
        if len(my_list) <= 2:
            return False
        if my_list[x] > my_list[1]:
            new_list.append(my_list[x])
    return new_list

v = values_greater_than_second([5,2,3,2,1,4])
print(v)
e = values_greater_than_second([3])
print(e)

#5 This Length, That Value
def length_and_value(s, v):
    my_list = []
    for i in range(0, s):
        my_list.append(v)
    return my_list

l = length_and_value(3, 2)
print(l)






