import collections
numbers = []
for i in range(10):
    numbers.append(int(input()))
counter = collections.Counter(numbers)
print(sum(numbers)//10,counter.most_common(1)[0][0],sep="\n")