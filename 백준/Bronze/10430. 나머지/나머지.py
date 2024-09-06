#A,B,C = map(int,input().split())

#print((A+B)%C, ((A%C)+(B%C))%C, (A*B)%C, ((A%C)*(B%C))%C, sep='\n')

a, b, c = input().split()
a = int(a)
b = int(b)
c = int(c)

print((a+b)%c)
print(((a%c)+(b%c))%c)
print((a*b)%c)
print(((a%c)*(b%c))%c)