def heapify(arr, n, i):
    max_val = i
    left = 2 * i + 1
    right = 2 * i + 2
    
    if (left<n) and (arr[i]<arr[left]):
        max_val = left

    if (right<n) and (arr[max_val]<arr[right]):
        max_val = right

    if (max_val != i):
        arr[max_val], arr[i] = arr[i], arr[max_val]
        heapify(arr, n, max_val)

def heap_sort(arr):
    n = len(arr)
    
    for i in range(n//2-1, -1, -1):
        heapify(arr, n, i)

    for i in range(n - 1, 0, -1):
        arr[0], arr[i] = arr[i], arr[0]
        heapify(arr, i, 0)

    return arr

arr = list(map(int, input().split()))
print(f"Sorted Array using Heap Sort: \n",*heap_sort(arr))