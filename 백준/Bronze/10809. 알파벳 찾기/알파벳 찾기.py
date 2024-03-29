S = input()
abc = 'abcdefghijklmnopqrstuvwxyz'

for x in abc:
    if x in S:
        print(S.index(x),end=' ')
    else:
        print(-1, end=' ')


