# #1 Basics
for x in range(0, 51, 1):
    print(x)

# #2 Multiples of Five
y = 5
while y <1001:
    print(y)
    y = y + 5

#3 Counting, the Dojo Way
for d in range(1, 101, 1):
    if d%10 == 0:
        print("Coding Dojo")
    elif d%5 == 0:
        print("Coding")
    else:
        print(d)

#4 Whoa. That Sucker's Huge 
sum = 0
for h in range(1, 500001, 1):
    if h%2 != 0:
        sum = sum + h
print(sum)

#5 Countdown by Fours
for f in range(2018, 1, -4):
    print(f)

#6 Flexible Counter
lowNum = 2
highNum = 9
mult = 3

for m in range(lowNum, highNum + 1):
    if m % mult == 0:
        print(m)

