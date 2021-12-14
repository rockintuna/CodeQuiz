test = [1,2,3,4,6]

print(test)
print(test[::-1])

test[0], test[1] = test[1], test[0]
print(test)

print(test.pop())
print(test.pop())
print(test.pop())
print(test.pop())
print(test.pop())

