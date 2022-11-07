def heapsort(A, n):
    for i in range(2, n):
        promove(A, i)
    for i in range(n, 1, -1):
        A[1], A[i] = A[i], A[1]
        demove(A, i - 1)
