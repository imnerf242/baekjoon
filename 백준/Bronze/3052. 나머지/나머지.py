list = []
list2 = []
count = 0
for x in range(1,11):
    num = int(input())
    list.append(num)

for y in range(0,len(list)):
    if int(list[y-1]) % 42 not in list2:
        list2.append(int(list[y-1]) % 42)
        count += 1
    else:
        count +=0

print(count)