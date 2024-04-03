k = int(input())
la= [] #['3', '5']
lb = [] #['abc', '/HTP']

for x in range(0,k):
    a,b = input().split(" ")
    la.append(a)
    lb.append(b)

for x in range(0,k):
    for y in range(0,len(lb[x])):
        K = list(lb[x])
        print(K[y] * int (la[x]),end="")
    print("")