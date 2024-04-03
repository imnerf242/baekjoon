k = int(input())
la= [] 
lb = [] 

for x in range(0,k):
    a,b = input().split(" ")
    la.append(a)
    lb.append(b)

for x in range(0,k):
    for y in range(0,len(lb[x])):
        K = list(lb[x])
        print(K[y] * int (la[x]),end="")
    print("")
    
#k = int(input())
#
#for x in range(0,k):
#    a,b = input().split(" ")
#    lb = list(b)
#    for k in range(0,len(lb)):
#        print(lb[k] * int(a) ,end="")
#    print()
