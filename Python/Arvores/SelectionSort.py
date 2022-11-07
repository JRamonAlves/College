def selectionsort(A):

    for i in range(len(A)):
        minimo = i
    
    for j in range(i + 1):
        if len(A[minimo]) < len(A[j]):
            minimo = j
        A[i], A[minimo] = A[minimo], A[i]

    print(A)
    return(A)

arranjo = ["joseramon", "sidrak", "gabryel"]

selectionsort(arranjo)