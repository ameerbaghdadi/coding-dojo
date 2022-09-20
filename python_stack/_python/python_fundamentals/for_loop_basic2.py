#1 Biggie Size
print("#1 Biggie Size")
def biggie_size(my_list):
    for i in range(0, len(my_list)):
        if my_list[i] > 0:
            my_list[i] = "big"
    return my_list

print(biggie_size([-1, 3, 5, -5]))

#2 Count Positives
print("#2 Count Positives")
def  count_positives(my_list):
    count = 0
    for i in range(0, len(my_list)):
        if my_list[i] > 0:
            count += 1
    my_list[len(my_list)-1] = count
    return my_list

print(count_positives([-1, 1, 1, 1]))
print(count_positives([1, 6, -4, -2, -7, -2]))

#3 Sum Total
print("#3 Sum Total")
def sum_total(my_list):
    sum = 0
    for i in range(0, len(my_list)):
        sum += my_list[i]
    return sum

print(sum_total([1,2,3,4]))
print(sum_total([6,3,-2]))

#4 Average
print("#4 Average")
def average(my_list):
    sum = 0
    avg = 0
    for i in range(0, len(my_list)):
        sum += my_list[i]
    avg = sum / len(my_list)
    return avg

print(average([1,2,3,4]))

#5 Length
print("#4 Average")
def length(my_list):
    count = 0
    for i in range(0, len(my_list)):
        count += 1
    return count

print(length([37,2,1,-9]))
print(length([]))

#6 Minimum
print("#6 Minimum")
def minimum(my_list):
    if my_list == []:
        return False
    temp = my_list[0]
    for i in range(0, len(my_list)):
        if my_list[i] < temp:
            temp = my_list[i]
    return temp

print(minimum([37,2,1,-9]))
print(minimum([]))

#7 Maximum
print("#7 Maximum")
def maximum(my_list):
    if my_list == []:
        return False
    temp = my_list[0]
    for i in range(0, len(my_list)):
        if my_list[i] > temp:
            temp = my_list[i]
    return temp

print(maximum([37,2,1,-9]))
print(maximum([]))

#8 Ultimate Analysis
print("#8 Ultimate Analysis")
def ultimate_analysis(my_list):
    sum = 0
    avg = 0
    min = my_list[0]
    max = my_list[0]
    if my_list == []:
            return False
    for i in range(0, len(my_list)):
        sum += my_list[i]
        if my_list[i] < min:
            min = my_list[i]
            if my_list[i] > max:
                min = my_list[i]
    avg = sum/len(my_list)
    dictionary = {'sumTotal': sum, 'average': avg, 'minimum': min, 'maximum': max, 'length': len(my_list)}
    return dictionary

print(ultimate_analysis([37,2,1,-9]))

#9 Reverse List
print("#9 Reverse List")
def reverse_list(my_list):
    temp =0
    length = round(len(my_list)/2)
    for i in range(0, length):
        temp = my_list[i]
        my_list[i] = my_list[len(my_list) -1 -i]
        my_list[len(my_list) -1 -i] = temp
    return my_list

print(reverse_list([37,2,1,-9]))