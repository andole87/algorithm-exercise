s= int(input())
books = []
for _ in range(9):
    books.append(int(input()))

print(s - sum(books))