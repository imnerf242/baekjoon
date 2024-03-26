case = int(input())
room = []

for x in range(1,case+1):
    H,W,N = map(int, input().split())

    floor = N % H
    num = (N // H) + 1

    if N % H == 0:
        floor = H
        num = (N // H)
    x = 100 * floor + num * 1
    room.append(x)

print(*room, sep='\n')

