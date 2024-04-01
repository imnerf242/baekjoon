H,M = map(int, input().split())

if M < 45 :
    if H>0 and H<=23:
        H -= 1
        M = M+15
    elif H == 0:
        H=23
        M = M + 15
elif M>= 45:
    M -=45

print(H,end=" ")
print(M)