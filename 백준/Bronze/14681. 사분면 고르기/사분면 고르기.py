x= int(input())
y= int(input())

if x > 0 and y > 0 :	# x,y: 양수
    print('1')
elif x < 0 and y > 0 :	# x:음수, y:양수
    print('2')
elif x < 0 and y < 0 :	# x,y: 음수
    print('3')
else:    # x:양수, y:음수
    print('4')