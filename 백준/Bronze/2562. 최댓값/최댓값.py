list = []

for x in range(1,10):
    num = int(input())
    list.append(num)

max = max(list)
count = int(list.index(max)) + 1
print(max)
print(count)
