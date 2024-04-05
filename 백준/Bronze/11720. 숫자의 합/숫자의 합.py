count = int(input())
num = 0

li = list(map(int,input()))

for x in range(count):
    num += li[x]

print(num)