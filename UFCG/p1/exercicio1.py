a = float(input())
b = float(input())
c = float(input())

delta = b ** 2 - 4 * a * c

if delta > 0:
    x1 = -b + (delta ** 1/2) / 2 * a
    x2 = -b - (delta ** 1/2) / 2 * a
    print(x1)
    print(x2)

elif delta == 0:
    x = -b + (delta ** 1/2) / 2 * a
    print(x)