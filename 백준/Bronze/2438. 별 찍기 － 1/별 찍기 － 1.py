n = int(input())

if 1<=n<=100:
    for i in range(0,n):
        print('*',end="")
        for x in range(0,i):
            print('*',end="")
        print('')

else:
    exit()