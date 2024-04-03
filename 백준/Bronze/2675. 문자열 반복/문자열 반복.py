k = int(input())

for x in range(k):
    a,b = input().split()
    for y in b:
        print(y*int(a),end="")
    print()